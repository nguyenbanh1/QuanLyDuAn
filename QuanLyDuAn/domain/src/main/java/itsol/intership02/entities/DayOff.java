package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "DAY_OFF")
public class DayOff {
    @Id
    @SequenceGenerator(name = "DayOffSequence",sequenceName = "Day_off_sequence")
    @GeneratedValue(generator = "DayOffSequence")
    @Column(name = "DAY_OFF_ID")
    private int id;

    @Column(name = "DAY_OFF_CODE")
    private String code;

    @Column(name = "DAY_OFF_TYPE")
    private boolean type;

    @Column(name = "DAY_OFF_WEEK")
    private Date dayOffWeek;

    @Column(name = "DAY_OFF_YEAR")
    private Date dayOffYear;

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

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Date getDayOffWeek() {
        return dayOffWeek;
    }

    public void setDayOffWeek(Date dayOffWeek) {
        this.dayOffWeek = dayOffWeek;
    }

    public Date getDayOffYear() {
        return dayOffYear;
    }

    public void setDayOffYear(Date dayOffYear) {
        this.dayOffYear = dayOffYear;
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
