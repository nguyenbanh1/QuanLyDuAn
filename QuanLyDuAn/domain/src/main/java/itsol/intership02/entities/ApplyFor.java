package itsol.intership02.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "APPLY_FOR")
public class ApplyFor {

    @Id
    @Column(name = "APPLY_FOR_ID")
    @SequenceGenerator(name = "apply_for_generator", sequenceName = "apply_for_sequence")
    @GeneratedValue(generator = "apply_for_generator")
    private int applyForId;

    @Column(name = "APPLY_FOR_CODE")
    private String applyForCode;

    @Column(name = "APPLY_FOR_DESCRIPTION")
    private String applyForDescription;

    @Column(name = "APPLY_FOR_TYPE")
    private String applyForType;

    @Column(name = "DATE_CREATED")
    private Date dateCreated;

    @Column(name = "DATE_UPDATED")
    private Date dateUpdated;

    @ManyToOne
    @JoinColumn(name = "USER_CREATED")
    private Staff userCreated;

    @ManyToOne
    @JoinColumn(name = "USER_UPDATED")
    private Staff userUpdated;

    @Column(name = "STATUS")
    private boolean status;

    public int getApplyForId() {
        return applyForId;
    }

    public void setApplyForId(int applyForId) {
        this.applyForId = applyForId;
    }

    public String getApplyForCode() {
        return applyForCode;
    }

    public void setApplyForCode(String applyForCode) {
        this.applyForCode = applyForCode;
    }

    public String getApplyForDescription() {
        return applyForDescription;
    }

    public void setApplyForDescription(String applyForDescription) {
        this.applyForDescription = applyForDescription;
    }

    public String getApplyForType() {
        return applyForType;
    }

    public void setApplyForType(String applyForType) {
        this.applyForType = applyForType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Staff getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Staff userCreated) {
        this.userCreated = userCreated;
    }

    public Staff getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(Staff userUpdated) {
        this.userUpdated = userUpdated;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
