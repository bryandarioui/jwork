package BryanDarioLesmana.jwork.controller;
/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
import BryanDarioLesmana.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/recruiter")
@RestController
/** inisiasi class */
public class RecruiterController {
    @RequestMapping("")
    /**
     * getter all recruiter
     */
    public ArrayList<Recruiter> getAllRecruiter(){
        ArrayList<Recruiter> recruiter = null;
        recruiter = DatabaseRecruiter.getRecruiterDatabase();
        return recruiter;
    }
    /**
     * method getter Recruiter dengan id
     * @param id id
     * @return Recruiter dengan id yang sesuai
     */
    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
            return null;
        }
        return recruiter;
    }
    /**
     * method untuk menambah recruiter
     * @param name name
     * @param email email
     * @param phoneNumber phoneNumber
     * @param province province
     * @param city city
     * @param description description
     * @return recruiter
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value ="name") String name,
                                  @RequestParam(value ="email") String email,
                                  @RequestParam(value ="phoneNumber") String phoneNumber,
                                  @RequestParam(value ="province") String province,
                                  @RequestParam(value ="city") String city,
                                  @RequestParam(value ="description") String description){
        Location location = new Location(province, city, description);
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, location);

        if (DatabaseRecruiter.addRecruiter(recruiter)){
            return recruiter;
        }
        else{
            return null;
        }
    }
}
