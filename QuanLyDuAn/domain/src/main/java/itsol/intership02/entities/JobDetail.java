package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "JOB_DETAIL")
public class JobDetail {
    @Id
    @SequenceGenerator(name = "JobDetailGenerator",sequenceName = "Job_Detail_sequence")
    @GeneratedValue(generator = "JobDetailGenerator")
    @Column(name = "JOB_DETAIL_ID")
    private int id;

    @Column(name = "JOB_DETAIL_CODE")
    private String code;

    @Column(name = "JOB_DETAIL_NAME")
    private String name;

    @Column(name = "STAFF_ID")
    private int staffId;

    @Column(name = "COMPANY_PROJECT_ID")
    private int projectId;

    @Column(name = "JOB_ID")
    private int jodId;

    @Column(name = "COMPANY_ID")
    private int companyId;

    @Column(name = "EVALUATION")
    private String evaluation;

    @Column(name = "SCHEDULE_START_TIME")
    private Date sheduleStart;

    @Column(name = "SCHEDULE_END_TIME")
    private Date sheduleEnd;

    @Column(name = "ACTUAL_START")
    private Date actualStart;

    @Column(name = "ACTUAL_END")
    private Date actualEnd;

    @Column(name = "NUMBER_OF_MEMBER")
    private int numMembers;

    @Column(name = "PROJECT_POSITION")
    private String projectPosition;

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

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getJodId() {
        return jodId;
    }

    public void setJodId(int jodId) {
        this.jodId = jodId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
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

    public int getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    public String getProjectPosition() {
        return projectPosition;
    }

    public void setProjectPosition(String projectPosition) {
        this.projectPosition = projectPosition;
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
