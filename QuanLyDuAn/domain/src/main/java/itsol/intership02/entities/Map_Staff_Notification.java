package itsol.intership02.entities;

import javax.persistence.*;

@Entity
@Table(name = "Map_Staff_Notification")
public class Map_Staff_Notification {

    @Id
    @Column(name = "MAP_STAFF_NOTIFICATION_ID")
    @SequenceGenerator(name = "map_staff_notificationGenerator",sequenceName = "map_staff_notification_Sequence")
    @GeneratedValue(generator = "map_staff_notificationGenerator")
    private int id;



    @JoinColumn(name = "STAFF_ID")
    @ManyToOne
    private Staff staff;


    @JoinColumn(name = "NOTIFICATION_ID")
    @ManyToOne
    private Notification notification;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
