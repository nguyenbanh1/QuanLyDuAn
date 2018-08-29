package itsol.intership02.controller;

import exeption.DataNotFoundExeption;
import itsol.intership02.dao.StaffDAO;
import itsol.intership02.entities.Staff;

import itsol.intership02.security.manager.authentication.AccountCredentials;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@RestController

public class LoginController {

    @Autowired
    private StaffDAO staffDAO;

    @Autowired
    private BCryptPasswordEncoder encoder;


    @RequestMapping(value = "/register",method = RequestMethod.POST,produces = {"application/json"})
    public ResponseEntity<?> register(@RequestBody Staff staff){

        HttpHeaders httpHeaders = new HttpHeaders();


        if(staff == null || staff.getUsername() == null || staff.getPassword() == null){
            httpHeaders.add("status","fail");
            httpHeaders.add("message","object,username or password is null");
            return ResponseEntity.noContent().headers(httpHeaders).build();
        }
        if(staffDAO.existsByUsername(staff.getUsername())){

            httpHeaders.add("status","fail");
            httpHeaders.add("message","username is exists");

            return ResponseEntity.badRequest().headers(httpHeaders).build();
        }



        Date date_current = new Date();
        staff.setDate_created(date_current);
        staff.setDate_update(date_current);
        String hashPassword = encoder.encode(staff.getPassword());
        staff.setPassword(hashPassword);

        staffDAO.save(staff);

        httpHeaders.add("status" ,"success");

        return ResponseEntity.accepted().headers(httpHeaders).build();
    }

    @RequestMapping(value = "/test/staff",method = RequestMethod.GET,produces = {"application/json"})
    @CrossOrigin
    public ResponseEntity<AccountCredentials> getStaff(HttpServletRequest request,HttpServletResponse response){

        HttpHeaders httpHeaders = new HttpHeaders();
        //httpHeaders.add("nguyen","rewrewrewrewrew");
        System.out.println("nguyen : " + request.getHeader("Authorization"));


        return new ResponseEntity<>(new AccountCredentials(),httpHeaders,HttpStatus.OK);
    }

    @PostMapping(value = "/test/staff/add")
    public void post(){
        System.out.println("pass");
    }


    @RequestMapping(value = "test/exeption",method = RequestMethod.GET)
    public void getTestExeption(){
        System.out.println("before exeption");
        try{
            throw new DataNotFoundExeption("not found rewrew");

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }


}
