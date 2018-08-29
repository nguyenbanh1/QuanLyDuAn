package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CONTRACT")
public class Contract {

    @Column(name = "CONTRACT_ID")
    @SequenceGenerator(name = "Contract_Generator",sequenceName = "Contract_sequence")
    @GeneratedValue(generator = "Contract_Generator")
    @Id
    private int id;


    @Column(name = "CONTRACT_CODE")
    private String code;

    @Column(name = "CONTRACT_NAME")
    private String name;

    @Column(name = "CONTRACT_TYPE")
    private int type;

    @Column(name = "SALARY_NET")
    private int SALARY_NET;

    @Column(name = "SALARY_GROSS")
    private int SALARY_GROSS;

    @Column(name = "START_DATE")
    private Date start_date;

    @Column(name = "END_DATE")
    private Date end_date;

    @Column(name = "STATUS")
    private boolean status;

    @Column(name = "USER_CREATED")
    private int user_created;

    @Column(name = "USER_UPDATED")
    private int user_updated;

    @Column(name = "DATE_CREATED")
    private Date date_created;

    @Column(name = "DATE_UPDATED")
    private Date date_updated;


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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSALARY_NET() {
        return SALARY_NET;
    }

    public void setSALARY_NET(int SALARY_NET) {
        this.SALARY_NET = SALARY_NET;
    }

    public int getSALARY_GROSS() {
        return SALARY_GROSS;
    }

    public void setSALARY_GROSS(int SALARY_GROSS) {
        this.SALARY_GROSS = SALARY_GROSS;
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

    public int getUser_updated() {
        return user_updated;
    }

    public void setUser_updated(int user_updated) {
        this.user_updated = user_updated;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(Date date_updated) {
        this.date_updated = date_updated;
    }
}
