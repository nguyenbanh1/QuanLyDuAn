package itsol.intership02.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COMPANY_NOTIFICATION")
public class Notification {
    @Id
    @SequenceGenerator(name = "NotificationGenerator",sequenceName = "Notification_sequence")
    @GeneratedValue(generator = "NotificationGenerator")
    @Column(name = "COMPANY_NOTIFICATION_ID")
    private int id;

    @Column(name = "COMPANY_NOTIFICATION_CODE")
    private String code;

    @Column(name = "COMPANY_NOTIFICATION_NAME")
    private String name;



    @Column(name = "STAFF_ID")
    private int staffId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "COMPANY_NOTIFICATION_CONTENT")
    private String content;

    @Column(name = "URL_TEMPLATE")
    private String urlTemplate;

    @Column(name = "APPLY_FOR_ID")
    private int appplyForId;

    @OneToMany(mappedBy = "notification")
    private List<Map_Staff_Notification> map_staff_notifications = new ArrayList<Map_Staff_Notification>();


    @ManyToOne
    @JoinColumn(name = "USER_CREATED")
    private Staff user_created;

    @ManyToOne
    @JoinColumn(name = "USER_UPDATE")
    private Staff user_update;

    @Column(name = "DATE_CREATED")
    private Date date_created;

    @Column(name = "DATE_UPDATE")
    private Date date_update;

    public List<Map_Staff_Notification> getMap_staff_notifications() {
        return map_staff_notifications;
    }

    public void setMap_staff_notifications(List<Map_Staff_Notification> map_staff_notifications) {
        this.map_staff_notifications = map_staff_notifications;
    }

    public Staff getUser_created() {
        return user_created;
    }

    public void setUser_created(Staff user_created) {
        this.user_created = user_created;
    }

    public Staff getUser_update() {
        return user_update;
    }

    public void setUser_update(Staff user_update) {
        this.user_update = user_update;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlTemplate() {
        return urlTemplate;
    }

    public void setUrlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
    }

    public int getAppplyForId() {
        return appplyForId;
    }

    public void setAppplyForId(int appplyForId) {
        this.appplyForId = appplyForId;
    }
}