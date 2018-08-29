package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="CONFIGURATION_DETAIL")
public class Configuration_detail {

    @Id
    @Column(name="CONFIGURATION_DETAIL_ID")
    @GeneratedValue
    private int configuration_detail_id;

    @ManyToOne
    @JoinColumn(name="CONFIGURATION_ID")
    private Configuration_master configuration_id;

    @Column(name="CONFIGURATION_DETAIL_CODE")
    private String configuration_detail_code;

    @Column(name="STATUS")
    private boolean status;

    @Column(name="CONF_D_VALUE")
    private String conf_d_value;

    @Column(name="DATE_CREATED")
    private Date date_created;

    @Column(name="DATE_UPDATE")
    private Date date_update;

    @Column(name="USER_CREATED")
    private int user_created;

    @Column(name="USER_UPDATE")
    private int user_update;

    @Column(name="DESCRIPTION")
    private String description;

    @ManyToOne
    @JoinColumn(name="APPLY_FOR_DETAIL_ID")
    private ApplyForDetail apply_for_detail_id;


    public int getConfiguration_detail_id() {
        return configuration_detail_id;
    }

    public void setConfiguration_detail_id(int configuration_detail_id) {
        this.configuration_detail_id = configuration_detail_id;
    }

    public Configuration_master getConfiguration_id() {
        return configuration_id;
    }

    public void setConfiguration_id(Configuration_master configuration_id) {
        this.configuration_id = configuration_id;
    }

    public ApplyForDetail getApply_for_detail_id() {
        return apply_for_detail_id;
    }

    public void setApply_for_detail_id(ApplyForDetail apply_for_detail_id) {
        this.apply_for_detail_id = apply_for_detail_id;
    }

    public String getConfiguration_detail_code() {
        return configuration_detail_code;
    }

    public void setConfiguration_detail_code(String configuration_detail_code) {
        this.configuration_detail_code = configuration_detail_code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getConf_d_value() {
        return conf_d_value;
    }

    public void setConf_d_value(String conf_d_value) {
        this.conf_d_value = conf_d_value;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
