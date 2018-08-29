package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "TIMESHEET_DETAIL")
public class TimesheetDetail {
    @Id
    @SequenceGenerator(name = "TimesheetDetailSequence",sequenceName = "timesheet_detail_sequence")
    @GeneratedValue(generator = "TimesheetDetailSequence")
    @Column(name = "TIMESHEET_DETAIL_ID")
    private int id;

    @Column(name = "TIMESHEET_ID")
    private int timesheetId;

    @Column(name = "WORK_DATE")
    private Date workDate;

    @Column(name = "CHECK_IN_TIME")
    private Date checkInTime;

    @Column(name = "CHECK_OUT_TIME")
    private Date checkOutTime;

    @Column(name = "COMPANY_ID")
    private int companyId;

    @Column(name = "LAT")
    private int lat;

    @Column(name = "LNG")
    private int lng;

    @Column(name = "DISTANCE")
    private float distance;

    @Column(name = "STATUS_WAITING")
    private int statusWaiting;

    @Column(name = "TD_DESCRIPTION")
    private String description;

    @Column(name = "CONFIGURATION_DETAIL_ID")
    private int confDetailId;

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

    public int getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(int timesheetId) {
        this.timesheetId = timesheetId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLng() {
        return lng;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getStatusWaiting() {
        return statusWaiting;
    }

    public void setStatusWaiting(int statusWaiting) {
        this.statusWaiting = statusWaiting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getConfDetailId() {
        return confDetailId;
    }

    public void setConfDetailId(int confDetailId) {
        this.confDetailId = confDetailId;
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
