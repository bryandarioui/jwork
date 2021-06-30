package BryanDarioLesmana.jwork.controller;
/**
 * @author Bryan Dario Lesmana (1806199940)
 * @version 28/06/21
 */
import BryanDarioLesmana.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController

/** inisiasi class */
public class InvoiceController {
    /**
     * method getter untuk semua invoice
     * @return invoice
     */
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice(){
        return DatabaseInvoice.getInvoiceDatabase();
    }
    /**
     * method getter invoice dengan id
     * @return invoice pada id
     */
    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }
    /**
     * method getter invoice dengan jobseeker
     * @param jobseekerId jobseekerId
     * @return invoice pada jobseeker id yang sesuai
     */
    @RequestMapping(value = "/jobseeker/{jobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerId) {
        return DatabaseInvoice.getInvoiceByJobseeker(jobseekerId);
    }
    /**
     * method invoice status lain
     * @param id invoice
     * @param invoiceStatus yang mengeluarkan hasil cancelled atau finished
     * @return nilai invoice terbaru
     */
    @RequestMapping(value = "/invoiceStatus", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus invoiceStatus) throws InvoiceNotFoundException {
        DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus);
        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        return invoice;
    }
    /**
     * method menghapus invoice dengan menggunakan id
     * @param id id
     * @return hasilnya true jika telah terhapus
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@RequestParam(value = "id") int id){
        try{
            DatabaseInvoice.removeInvoice(id);
        } catch (InvoiceNotFoundException e){
            e.getMessage();
            return false;
        }
        return true;
    }

    /**
     * method invoice baru dengan Bank Payment
     * @param jobIdList list job yang akan dipilih
     * @param jobseekerId seseorang yang melamar kerja
     * @param adminFee gaji admin
     * @return invoice yang telah dibuat
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee){
        ArrayList<Job> job = new ArrayList<>();
        for (int jobs : jobIdList) {
            try {
                job.add(DatabaseJob.getJobById(jobs));
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new BankPayment(DatabaseInvoice.getLastId()+1, job,
                    DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), adminFee);
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalFee();
            return invoice;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    /**
     * method invoice baru dengan EWalletPayment
     * @param jobIdList list job yang akan dipilih
     * @param jobseekerId seseorang yang melamar kerja
     * @param referralCode bonus kode yang dipakai
     * @return invoice yang telah dibuat
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "referralCode") String referralCode)
    {
        try{
            ArrayList<Job> jobs = new ArrayList<Job>();
            for (Integer id : jobIdList){
                Job job = DatabaseJob.getJobById(id);
                jobs.add(job);
            }
            Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseekerById(jobseekerId);
            EwalletPayment ep = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, DatabaseBonus.getBonusByReferralCode(referralCode));
            DatabaseInvoice.addInvoice(ep);
            return ep;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}

