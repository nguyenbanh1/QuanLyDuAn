package itsol.intership02.controller;

import itsol.intership02.StaffService;
import itsol.intership02.dao.StaffDAO;
import itsol.intership02.entities.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;

@CrossOrigin
@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @Autowired
    private StaffDAO staffDAO;




    //delete 1 staff
   @RequestMapping(value = "test/staff/delete/{code}",method = RequestMethod.POST,produces = {"application/json"})

    public ResponseEntity<?>  deleteStaff(@PathVariable("code")String code,@RequestHeader String code2){
        HttpHeaders httpHeaders = new HttpHeaders();
        if (code2==null){
            httpHeaders.add("status","fail");
            httpHeaders.add("message","error");
            return ResponseEntity.noContent().headers(httpHeaders).build();
        }
        //staffDAO.deleteStaff(code,code2);
        httpHeaders.add("status" , "success");

        return ResponseEntity.accepted().headers(httpHeaders).build();

    }



    @RequestMapping(value = "/admin/staff/{code}",method = RequestMethod.GET,produces = {"application/json"})
    public Staff getStaffByCode(@PathVariable("code")String code){
        return null;
    }


    @RequestMapping(value = "/staff/all",method = RequestMethod.GET,produces = {"application/json"})
    public ResponseEntity<Object> getAllStaff(
            @RequestParam(value = "code",required = false) String code,
            @RequestParam(value = "name",required = false) String name)
    {

        List param = Arrays.asList(code,name);
        List<Object> list = staffService.getAll(param);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }


}
