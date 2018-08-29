package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "TIMESHEET")
public class Timesheet {
    @Id
    @SequenceGenerator(name = "TimesheetSequence",sequenceName = "timesheet_sequence")
    @GeneratedValue(generator = "TimesheetSequence")
    @Column(name = "TIMESHEET_ID")
    private int id;

    @Column(name = "STAFF_ID")
    private int staffId;

    @Column(name = "APPROVE_DATE")
    private Date approveDate;

    @Column(name = "APPROVE_USER")
    private int approceuUser;

    @Column(name = "CYCLE_ID")
    private int cycleId;

    @Column(name = "TOTAL_WORK_TIME")
    private int workTime;

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

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public int getApproceuUser() {
        return approceuUser;
    }

    public void setApproceuUser(int approceuUser) {
        this.approceuUser = approceuUser;
    }

    public int getCycleId() {
        return cycleId;
    }

    public void setCycleId(int cycleId) {
        this.cycleId = cycleId;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
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
