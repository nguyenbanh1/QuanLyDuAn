package itsol.intership02.controller;

import itsol.intership02.dao.NotificationDAO;
import itsol.intership02.dao.StaffDAO;
import itsol.intership02.entities.Notification;
import itsol.intership02.entities.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class NotificationController {
    @Autowired
    private NotificationDAO notificationDAO;

    @Autowired
    private StaffDAO staffDAO;

    @RequestMapping(value = "/admin/notification/add", method = RequestMethod.POST, produces = {"application/json"})
    public ResponseEntity<?> addNotification(@RequestBody Notification new_notification, @RequestHeader String code) {


        Staff staff_create = staffDAO.findByStaffcode(code).orElse(new Staff());
        Date date = new Date();

        new_notification.setDate_created(date);
        new_notification.setDate_update(date);
        new_notification.setUser_update(staff_create);
        new_notification.setUser_created(staff_create);

        notificationDAO.save(new_notification);


        HttpHeaders httpHeaders = new HttpHeaders();

        if (new_notification == null || new_notification.getCode() == null || new_notification.getContent() == null) {
            httpHeaders.add("status", "fail");
            httpHeaders.add("message", "Code or content is null");
            return ResponseEntity.noContent().headers(httpHeaders).build();
        }

        return null;
    }



    @RequestMapping(value = "/notification/{code}", method = RequestMethod.GET, produces = {"application/json"})
    public Notification getStaffByCode(@PathVariable("code") String code) {
        return notificationDAO.findByCode(code).orElse(new Notification());
    }

    @RequestMapping(value = "/notifications", method = RequestMethod.GET, produces = {"application/json"})
    public List<Notification> getAll() {
        return notificationDAO.findAll();
    }


}