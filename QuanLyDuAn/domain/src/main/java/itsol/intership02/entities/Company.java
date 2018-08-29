package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COMPANY")
public class Company {


    @Column(name = "COMPANY_ID")
    @SequenceGenerator(name = "Contract_Generator",sequenceName = "Contract_sequence")
    @GeneratedValue(generator = "Contract_Generator")
    @Id
    private int id;

    @Column(name = "COMPANY_CODE")
    private String code;

    @Column(name = "COMPANY_STRING")
    private String name;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TAX_CODE")
    private String tax_code;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phone_number;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "WEBSITE")
    private String website;

    @Column(name = "LONGITUDE",length = 5)
    private String longitude;

    @Column(name = "LATITUDE")
    private String latitude;

    @Column(name = "DATE_CREATED")
    private Date date_created;

    @Column(name = "DATE_UPDATE")
    private Date date_update;

    @Column(name = "USER_CREATED")
    private int user_created;

    @Column(name = "USER_UPDATE")
    private int user_update;

    @Column(name = "STATUS")
    private boolean status;


    @ManyToOne
    @JoinColumn(name = "CONF_AREA_ID")
    private Conf_Area conf_area;

    public Conf_Area getConf_area() {
        return conf_area;
    }

    public void setConf_area(Conf_Area conf_area) {
        this.conf_area = conf_area;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTax_code() {
        return tax_code;
    }

    public void setTax_code(String tax_code) {
        this.tax_code = tax_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
