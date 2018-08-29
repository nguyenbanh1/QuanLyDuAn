package itsol.intership02.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CONFIGURATION_MASTER")
public class Configuration_master {

    @Id
    @Column(name="CONFIGURATION_ID")
    @GeneratedValue
    private int configuration_id;

    @Column(name="CONFIGURATION_CODE")
    private String configuration_code;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="STATUS")
    private boolean status;

    @Column(name="USER_CREATED")
    private int user_created;

    @Column(name="USER_UPDATE")
    private int user_update;

    @Column (name="DATE_CREATED")
    private Date date_created;

    @Column(name="DATE_UPDATE")
    private Date date_update;

    public int getConfiguration_id() {
        return configuration_id;
    }

    public void setConfiguration_id(int configuration_id) {
        this.configuration_id = configuration_id;
    }

    public String getConfiguration_code() {
        return configuration_code;
    }

    public void setConfiguration_code(String configuration_code) {
        this.configuration_code = configuration_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getUser_update() {
        return user_update;
    }

    public void setUser_update(int user_update) {
        this.user_update = user_update;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }
}
