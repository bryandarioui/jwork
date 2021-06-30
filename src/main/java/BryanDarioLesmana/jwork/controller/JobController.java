package BryanDarioLesmana.jwork.controller;
/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
import BryanDarioLesmana.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/job")
@RestController
//class pada job controller//
public class JobController {
    /**
     * method getter untuk semua job
     * @return semua job
     */
    @RequestMapping("")
    public ArrayList<Job> getAllJob(){
        return DatabaseJob.getJobDatabase();
    }
    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job js = null;
        try {
            js = DatabaseJob.getJobById(id);
        } catch (JobNotFoundException e) {
            e.getMessage();
            return null;
        }
        return js;
    }
    /**
     * method getter menggunakan recruiter id
     * @param recruiterId
     * @return job dengan recruiter id yang sesuai
     */
    @RequestMapping(value = "/recruiter/{recruiterId}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        return DatabaseJob.getJobByRecruiter(recruiterId);
    }
    /**
     * method getter menggunakan kategori
     * @param category
     * @return job dengan kategori yang sesuai
     */
    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        return DatabaseJob.getJobByCategory(category);
    }
    /**
     * method penambahan job
     * @param name nama pekerjaan
     * @param fee bonus
     * @param category kategori job
     * @param recruiterId
     * @return job yang telah dibuat
     * @throws RecruiterNotFoundException
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value="name") String name,
                      @RequestParam(value="fee") int fee,
                      @RequestParam(value="category") JobCategory category,
                      @RequestParam(value="recruiter id") int recruiterId)
            throws RecruiterNotFoundException{
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(recruiterId);
        } catch (RecruiterNotFoundException error)
        {
            throw error;
        }
        Job job = new Job(DatabaseJob.getLastId(), name, recruiter, fee, category);
        boolean success = DatabaseJob.addJob(job);

        if (success){
            return job;
        }
        else{
            return null;
        }
    }
}
