package itsol.intership02.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="SALARY_DETAIL")
public class Salary_detail {
    @Id
    @SequenceGenerator(name = "SalaryDetailGenerator", sequenceName = "SalaryDetail_sequence")
    @GeneratedValue(generator = "SalaryDetailGenerator")
    @Column(name = "SALARY_DETAIL_ID")
    private int id;

    @JoinColumn(name = "SALARY_ID")
    @ManyToOne
    private Salary salaryId;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "SALARY_OT")
    private int salaryOT;

    @Column(name = "SALARY_OTHER")
    private  int salaryOther;

    @Column(name = "REASON_FOR_SALARY_OTHER")
    private String reason;

    @Column(name = "SALARY_TOTAL")
    private  int salaryTotal;

    @Column(name = "STATUS")
    private  int status;


    @Column(name = "DATE_CREATED")
    private Date date_created;

    @ManyToOne
    @JoinColumn(name = "USER_CREATED")
    private Staff user_created;


    @Column(name = "DATE_UPDATE")
    private Date date_update;

    @ManyToOne
    @JoinColumn(name = "USER_UPDATE")
    private Staff user_update;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Salary getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Salary salaryId) {
        this.salaryId = salaryId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getSalaryOT() {
        return salaryOT;
    }

    public void setSalaryOT(int salaryOT) {
        this.salaryOT = salaryOT;
    }

    public int getSalaryOther() {
        return salaryOther;
    }

    public void setSalaryOther(int salaryOther) {
        this.salaryOther = salaryOther;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getSalaryTotal() {
        return salaryTotal;
    }

    public void setSalaryTotal(int salaryTotal) {
        this.salaryTotal = salaryTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Staff getUser_created() {
        return user_created;
    }

    public void setUser_created(Staff user_created) {
        this.user_created = user_created;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }

    public Staff getUser_update() {
        return user_update;
    }

    public void setUser_update(Staff user_update) {
        this.user_update = user_update;
    }
}
