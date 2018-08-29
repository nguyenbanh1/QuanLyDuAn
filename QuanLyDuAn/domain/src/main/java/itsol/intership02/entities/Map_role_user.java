package itsol.intership02.entities;

import javax.persistence.*;


@Entity
@Table(name = "MAP_ROLE_STAFF")
public class Map_role_user {
    @Column(name = "ROLE_USER_ID")
    @Id
    @SequenceGenerator(name = "Role_UserGenerator",sequenceName = "Role_User_sequence")
    @GeneratedValue(generator = "Role_UserGenerator")
    private int id;

    @JoinColumn(name = "ROLE_ID")
    @ManyToOne
    private Role role_id;

    @JoinColumn(name = "STAFF_ID")
    @ManyToOne
    private Staff staff_id;

    @Column(name = "STATUS")
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole_id() {
        return role_id;
    }

    public void setRole_id(Role role_id) {
        this.role_id = role_id;
    }

    public Staff getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Staff staff_id) {
        this.staff_id = staff_id;
    }

}
