package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MAP_PROJECT_STAFF")
public class Map_Project_Staff {

    @Column(name = "MAP_PROJECT_STAFF_ID")
    @SequenceGenerator(name = "project_staff_Generator",sequenceName = "map_project_staff_seq",allocationSize = 9999)
    @GeneratedValue(generator = "project_staff_Generator")
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "COMPANY_PROJECT_ID")
    private Company_Project company_project;

    @ManyToOne
    @JoinColumn(name = "STAFF_ID")
    private Staff staff_id;

    @Column(name = "BONUS")
    private int bonus;

    @Column(name = "PROGRESS")
    private int progress;

    @Column(name = "START_DATE")
    private Date start_date;

    @Column(name = "END_DATE")
    private Date end_date;

    @Column(name = "STAFF_EVALUATION")
    private String staff_evaluation;

    @Column(name = "STATUS")
    private boolean status;

    @Column(name = "USER_CREATED")
    private int user_created;

    @Column(name = "USER_UPDATE")
    private int user_update;

    @Column(name = "DATE_CREATED")
    private Date date_created;

    @Column(name = "DATE_UPDATE")
    private Date date_update;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company_Project getCompany_project() {
        return company_project;
    }

    public void setCompany_project(Company_Project company_project) {
        this.company_project = company_project;
    }

    public Staff getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Staff staff_id) {
        this.staff_id = staff_id;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getStaff_evaluation() {
        return staff_evaluation;
    }

    public void setStaff_evaluation(String staff_evaluation) {
        this.staff_evaluation = staff_evaluation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getUser_created() {
        return user_created;
    }

    public void setUser_created(int user_created) {
        this.user_created = user_created;
    }

    public int getUser_update() {
        return user_update;
    }

    public void setUser_update(int user_update) {
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
}
