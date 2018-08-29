package itsol.intership02.controller;

import itsol.intership02.dao.ConfAreaDAO;
import itsol.intership02.entities.Conf_Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ConfAreaController {
    @Autowired
    private ConfAreaDAO confAreaDAO;



    //them ConfArea chinguyen 15/8
    @RequestMapping(value = "admin/area/post",method = RequestMethod.POST,produces = {"application/json"})
    public void postConfArea(@RequestBody Conf_Area newConfArea){//,@RequestHeader String code){

        //Staff staff_create = staffDAO.findByStaffcode(code).orElse(new Staff());
        Date date = new Date();

        newConfArea.setDate_created(date);
        //   newConfArea.setUser_created(staff_create);
        newConfArea.setStatus(true);

        confAreaDAO.save(newConfArea);
    };


}
