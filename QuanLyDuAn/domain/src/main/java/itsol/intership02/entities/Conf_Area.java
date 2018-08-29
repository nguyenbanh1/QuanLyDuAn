package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CONF_AREA")
public class Conf_Area {

    @Id
    @Column(name = "CONF_AREA_ID")
    @SequenceGenerator(name = "ConfArea_Generator",sequenceName = "conf_area_sequence")
    @GeneratedValue(generator = "ConfArea_Generator")
    private int conf_area_id;

    @Column(name = "CONF_AREA_CODE")
    private String conf_area_code;

    @Column(name = "CONF_AREA_NAME")
    private String conf_area_name;


    @Column(name = "PROVINCE_CODE")
    private String province_code;

    @Column(name = "PROVINCE_NAME")
    private String province_name;

    @Column(name = "DISTRICT_CODE")
    private String district_code;

    @Column(name = "DISTRICT_NAME")
    private String district_name;

    @Column(name = "COMMUNE_CODE")
    private String commune_code;

    @Column(name = "COMMUNE_NAME")
    private String commune_name;


    @Column(name = "PRECINCT_CODE")
    private String precinct_code;


    @Column(name = "PRECINCT_NAME")
    private String precint_name;

    @Column(name = "AREA_TYPE")
    private boolean area_type;

    @Column(name = "AREA_DESCRIPTION")
    private String area_description;

    @Column(name = "DATE_CREATED")
    private Date date_created;

    @Column(name = "DATE_UPDATE")
    private Date date_update;

    @ManyToOne
    @JoinColumn(name = "USER_CREATED")
    private Staff user_created;

    @ManyToOne
    @JoinColumn(name = "USER_UPDATE")
    private Staff user_update;


    @Column(name = "STATUS")
    private boolean status;


    public int getConf_area_id() {
        return conf_area_id;
    }

    public void setConf_area_id(int conf_area_id) {
        this.conf_area_id = conf_area_id;
    }

    public String getConf_area_code() {
        return conf_area_code;
    }

    public void setConf_area_code(String conf_area_code) {
        this.conf_area_code = conf_area_code;
    }

    public String getConf_area_name() {
        return conf_area_name;
    }

    public void setConf_area_name(String conf_area_name) {
        this.conf_area_name = conf_area_name;
    }

    public String getProvince_code() {
        return province_code;
    }

    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getDistrict_code() {
        return district_code;
    }

    public void setDistrict_code(String district_code) {
        this.district_code = district_code;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getCommune_code() {
        return commune_code;
    }

    public void setCommune_code(String commune_code) {
        this.commune_code = commune_code;
    }

    public String getCommune_name() {
        return commune_name;
    }

    public void setCommune_name(String commune_name) {
        this.commune_name = commune_name;
    }

    public String getPrecinct_code() {
        return precinct_code;
    }

    public void setPrecinct_code(String precinct_code) {
        this.precinct_code = precinct_code;
    }

    public String getPrecint_name() {
        return precint_name;
    }

    public void setPrecint_name(String precint_name) {
        this.precint_name = precint_name;
    }

    public boolean isArea_type() {
        return area_type;
    }

    public void setArea_type(boolean area_type) {
        this.area_type = area_type;
    }

    public String getArea_description() {
        return area_description;
    }

    public void setArea_description(String area_description) {
        this.area_description = area_description;
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

    public Staff getUser_created() {
        return user_created;
    }

    public void setUser_created(Staff user_created) {
        this.user_created = user_created;
    }

    public Staff getUser_update() {
        return user_update;
    }

    public void setUser_update(Staff user_update) {
        this.user_update = user_update;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
