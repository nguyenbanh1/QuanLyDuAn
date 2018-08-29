package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "CYCLE")
public class Cycle {

    @Id
    @SequenceGenerator(name = "CycleSequence",sequenceName = "cycle_sequence")
    @GeneratedValue(generator = "CycleSequence")
    @Column(name = "CYCLE_ID")
    private int id;

    @Column(name = "CYCLE_CODE")
    private String code;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

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
