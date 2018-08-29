package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="SALARY")
public class Salary {

    @Id
    @SequenceGenerator(name = "SalaryGenerator", sequenceName = "SalaryD_sequence")
    @GeneratedValue(generator = "SalaryGenerator")
    @Column(name = "SALARY")
    private int id;

    @JoinColumn(name = "CYCLE_ID")
    @ManyToOne
    private Cycle cycleId;

    @JoinColumn (name = "COMPANY_ID")
    @ManyToOne
    private Company companyId;

    @JoinColumn(name = "STAFF_ID")
    @ManyToOne
    private Staff staffId;

    @Column(name = "ACTUAL_NUMBER_WORK_DATE")
    private  int actualWorkDate;

    @Column(name = "NUMDER_REST_DAY")
    private int restDay;

    @Column(name = "NUMBER_WORK_DAY")
    private  int workDay;

    @Column(name = "SALARY_OTHER")
    private int salaryOther;

    @Column(name = "SALARY_GROSS")
    private  int salaryGross;

    @Column(name = "SALARY_NET")
    private int salaryNet;

    @Column(name = "STATUS")
    private  int status;

    @ManyToOne
    @JoinColumn(name = "USER_CREATED")
    private Staff user_created;

    @Column(name = "DATE_CREATED")
    private Date date_created;

    @ManyToOne
    @JoinColumn(name = "USER_UPDATE")
    private Staff user_update;



    @Column(name = "DATE_UPDATED")
    private Date date_update;

    @JoinColumn(name = "CONTRACT_ID")
    @ManyToOne
    private  Contract contractId;

    @Column(name = "SALARY_NAME")
    private  String salaryName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Cycle getCycleId() {
        return cycleId;
    }

    public void setCycleId(Cycle cycleId) {
        this.cycleId = cycleId;
    }

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }

    public Staff getStaffId() {
        return staffId;
    }

    public void setStaffId(Staff staffId) {
        this.staffId = staffId;
    }

    public int getActualWorkDate() {
        return actualWorkDate;
    }

    public void setActualWorkDate(int actualWorkDate) {
        this.actualWorkDate = actualWorkDate;
    }

    public int getRestDay() {
        return restDay;
    }

    public void setRestDay(int restDay) {
        this.restDay = restDay;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getSalaryOther() {
        return salaryOther;
    }

    public void setSalaryOther(int salaryOther) {
        this.salaryOther = salaryOther;
    }

    public int getSalaryGross() {
        return salaryGross;
    }

    public void setSalaryGross(int salaryGross) {
        this.salaryGross = salaryGross;
    }

    public int getSalaryNet() {
        return salaryNet;
    }

    public void setSalaryNet(int salaryNet) {
        this.salaryNet = salaryNet;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Staff getUser_created() {
        return user_created;
    }

    public void setUser_created(Staff user_created) {
        this.user_created = user_created;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Staff getUser_update() {
        return user_update;
    }

    public void setUser_update(Staff user_update) {
        this.user_update = user_update;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }

    public Contract getContractId() {
        return contractId;
    }

    public void setContractId(Contract contractId) {
        this.contractId = contractId;
    }

    public String getSalaryName() {
        return salaryName;
    }

    public void setSalaryName(String salaryName) {
        this.salaryName = salaryName;
    }
}
