package itsol.intership02.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "APPLY_FOR_DETAIL")
public class ApplyForDetail {

    @Id
    @Column(name = "APPLY_FOR_DETAIL_ID")
    @SequenceGenerator(name = "apply_for_detail_generator", sequenceName = "apply_for_detail_sequence")
    @GeneratedValue(generator = "apply_for_detail_generator")
    private int applyForDetailId;

    @Column(name = "APPLY_FOR_DETAIL_CODE")
    private String applyForDetailCode;

    @ManyToOne
    @JoinColumn(name = "APPLY_FOR_ID")
    private ApplyFor applyForID;

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

    @Column(name = "APPLY_FOR_OBJECT")
    private String applyForObject;

    @Column(name = "APPLY_FOR_DETAIL_DESCRIPTION")
    private String applyForDetailDescription;

    public int getApplyForDetailId() {
        return applyForDetailId;
    }

    public void setApplyForDetailId(int applyForDetailId) {
        this.applyForDetailId = applyForDetailId;
    }

    public String getApplyForDetailCode() {
        return applyForDetailCode;
    }

    public void setApplyForDetailCode(String applyForDetailCode) {
        this.applyForDetailCode = applyForDetailCode;
    }

    public ApplyFor getApplyForID() {
        return applyForID;
    }

    public void setApplyForID(ApplyFor applyForID) {
        this.applyForID = applyForID;
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

    public String getApplyForObject() {
        return applyForObject;
    }

    public void setApplyForObject(String applyForObject) {
        this.applyForObject = applyForObject;
    }

    public String getApplyForDetailDescription() {
        return applyForDetailDescription;
    }

    public void setApplyForDetailDescription(String applyForDetailDescription) {
        this.applyForDetailDescription = applyForDetailDescription;
    }
}


