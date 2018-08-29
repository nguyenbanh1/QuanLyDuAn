package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Job")
public class Job {
    @Id
    @SequenceGenerator(name = "JobGenerator",sequenceName = "Job_sequence")
    @GeneratedValue(generator = "JobGenerator")
    @Column(name = "JOB_ID")
    private int id;

    @Column(name = "JOB_CODE")
    private String code;

    @Column(name = "JOB_NAME")
    private String name;

    @Column(name = "SCHEDULE_START_TIME")
    private Date sheduleStart;

    @Column(name = "SCHEDULE_END_TIME")
    private Date sheduleEnd;

    @Column(name = "ACTUAL_START")
    private Date actualStart;

    @Column(name = "ACTUAL_END")
    private Date actualEnd;

    @Column(name = "JOB_DESCRIPTION")
    private String description;

    @Column(name = "JOB_EVALUATION")
    private String evaluation;

    @Column(name = "NUM_OF_MEMBERS")
    private int numMembers;

    @Column(name = "MANAGER_ID")
    private int managerId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "STATUS")
    private boolean status;

    @Column(name = "USER_CREATED")
    private int createUser;

    @Column(name = "DATE_CREATED")
    private Date createDate;

    @Column(name = "USER_UPDATE")
    private int updateUser;

    @Column(name = "DATE_UPDATE")
    private Date updateDate;

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

    public Date getSheduleStart() {
        return sheduleStart;
    }

    public void setSheduleStart(Date sheduleStart) {
        this.sheduleStart = sheduleStart;
    }

    public Date getSheduleEnd() {
        return sheduleEnd;
    }

    public void setSheduleEnd(Date sheduleEnd) {
        this.sheduleEnd = sheduleEnd;
    }

    public Date getActualStart() {
        return actualStart;
    }

    public void setActualStart(Date actualStart) {
        this.actualStart = actualStart;
    }

    public Date getActualEnd() {
        return actualEnd;
    }

    public void setActualEnd(Date actualEnd) {
        this.actualEnd = actualEnd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(int updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
