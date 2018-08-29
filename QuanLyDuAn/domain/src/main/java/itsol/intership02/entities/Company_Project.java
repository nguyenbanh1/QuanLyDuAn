package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;

@Table
@Entity
public class Company_Project {

    @Column(name = "COMPANY_PROJECT_ID")
    @SequenceGenerator(name = "Project_Generator",sequenceName = "company_project_seq",allocationSize = 9999)
    @GeneratedValue(generator = "Project_Generator")
    @Id
    private int id;


    @Column(name = "COMPANY_PROJECT_CODE")
    private String code;

    @Column(name = "COMPANY_PROJECT_NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "STAFF_ID")
    private Staff staff_id;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company_id;

    @Column(name = "SCHEDULE_START_TIME")
    private Date schedule_start_time;

    @Column(name = "SCHEDULE_END_TIME")
    private Date Schedule_end_time;

    @Column(name = "ACTUAL_START")
    private Date actual_start;

    @Column(name = "ACTUAL_END")
    private Date actual_end;


    @Column(name = "COMPANY_PROJECT_DESCRIPTION")
    private String company_project_description;

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

    @Column(name = "CUSTOMER")
    private String customer;

    @Column(name = "MAX_STAFF")
    private int max_staff;


    @Column(name = "COST")
    private int cost;

    @Column(name = "EXPECTED_COST")
    private int expected_cost;


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

    public Staff getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Staff staff_id) {
        this.staff_id = staff_id;
    }

    public Company getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Company company_id) {
        this.company_id = company_id;
    }

    public Date getSchedule_start_time() {
        return schedule_start_time;
    }

    public void setSchedule_start_time(Date schedule_start_time) {
        this.schedule_start_time = schedule_start_time;
    }

    public Date getSchedule_end_time() {
        return Schedule_end_time;
    }

    public void setSchedule_end_time(Date schedule_end_time) {
        Schedule_end_time = schedule_end_time;
    }

    public Date getActual_start() {
        return actual_start;
    }

    public void setActual_start(Date actual_start) {
        this.actual_start = actual_start;
    }

    public Date getActual_end() {
        return actual_end;
    }

    public void setActual_end(Date actual_end) {
        this.actual_end = actual_end;
    }

    public String getCompany_project_description() {
        return company_project_description;
    }

    public void setCompany_project_description(String company_project_description) {
        this.company_project_description = company_project_description;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getMax_staff() {
        return max_staff;
    }

    public void setMax_staff(int max_staff) {
        this.max_staff = max_staff;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getExpected_cost() {
        return expected_cost;
    }

    public void setExpected_cost(int expected_cost) {
        this.expected_cost = expected_cost;
    }
}
