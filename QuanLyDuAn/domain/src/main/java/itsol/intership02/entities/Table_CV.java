package itsol.intership02.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TABLE_CV")
public class Table_CV {

    @SequenceGenerator(name = "Table_CV_Generator",sequenceName = "Table_CV_sequence")
    @GeneratedValue(generator = "Table_CV_Generator")
    @Column(name = "CV_ID")
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "STAFF_ID")
    private Staff staff;


    @Column(name = "CV_Name")
    private String name;


    @Column(name = "DATA_RECRUITMENT")
    private Date Date_recuitment;

    @Column(name = "PRESENTER")
    private String presenter;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOBILE_PHONE")
    private int mobile_phone;

    @Column(name = "RESULT")
    private int result;

    @Column(name = "NOTE_RECRUITMENT")
    private String note_recruitment;

    @Column(name = "USER_UPDATE")
    private int user_update;

    @Column(name = "USER_CREATER")
    private int user_created;

    @Column(name = "DATE_CREATED")
    private Date date_created;


    @Column(name = "DATE_UPDATE")
    private Date date_update;

    @Column(name = "LINK_CV")
    private String link_cv;

    @Column(name = "STATUS")
    private boolean status;

    @Column(name = "RECRUITMENT_POSITION")
    private String recruitment_position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_recuitment() {
        return Date_recuitment;
    }

    public void setDate_recuitment(Date date_recuitment) {
        Date_recuitment = date_recuitment;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(int mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getNote_recruitment() {
        return note_recruitment;
    }

    public void setNote_recruitment(String note_recruitment) {
        this.note_recruitment = note_recruitment;
    }

    public int getUser_update() {
        return user_update;
    }

    public void setUser_update(int user_update) {
        this.user_update = user_update;
    }

    public int getUser_created() {
        return user_created;
    }

    public void setUser_created(int user_created) {
        this.user_created = user_created;
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

    public String getLink_cv() {
        return link_cv;
    }

    public void setLink_cv(String link_cv) {
        this.link_cv = link_cv;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRecruitment_position() {
        return recruitment_position;
    }

    public void setRecruitment_position(String recruitment_position) {
        this.recruitment_position = recruitment_position;
    }
}
