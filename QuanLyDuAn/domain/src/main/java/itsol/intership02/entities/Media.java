package itsol.intership02.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEDIA")
public class Media
{

        @Column(name = "MEDIA_ID")
        @Id
        @SequenceGenerator(name = "MediaGenerator",sequenceName = "media_sequence")
        @GeneratedValue(generator = "MediaGenerator")
        private int id;

        @Column(name = "MEDIA_CODE")
        private String code;

        @Column(name = "MEDIA_DESCRIPTION")
        private String description;


        @Column(name = "STATUS")
        private boolean status;


        @ManyToOne
        @JoinColumn(name = "STAFF_ID")
        private Staff staff;

        @ManyToOne
        @JoinColumn(name = "USER_CREATED")
        private Staff user_created;

        @ManyToOne
        @JoinColumn(name = "USER_UPDATE")
        private Staff user_update;


        @Column(name = "DATE_CREATED")
        private Date date_created;

        @Column(name = "DATE_UPDATE")
        private Date date_update;

        @Column(name = "MEDIA_URL")
        private String url;

        @Column(name = "MEDIA_NAME")
        private String name;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
