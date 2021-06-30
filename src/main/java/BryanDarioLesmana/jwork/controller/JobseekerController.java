package BryanDarioLesmana.jwork.controller;

import BryanDarioLesmana.jwork.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/jobseeker")
@RestController
//class untuk jobseekercontroller//
public class JobseekerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }
    /**
     * method getter jobseeker dengan id
     * @param id
     * @return jobseeker dengan id yang sesuai
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobseekerById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }
    /**
     * method untuk melakukan regist
     * @param name
     * @param email
     * @param password
     * @return jobseeker yang telah regist
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value="name") String name,
                                       @RequestParam(value="email") String email,
                                        @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastId()+1, name, email, password);
        try {
            DatabaseJobseekerPostgre.addJobseeker(jobseeker);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }
    /**
     * method untuk melakukan login
     * @param email
     * @param password
     * @return jobseeker yang telah login
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseekerLogin(email,password);
        return jobseeker;
    }
}