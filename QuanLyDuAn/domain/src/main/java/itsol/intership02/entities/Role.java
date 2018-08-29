package itsol.intership02.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ROLE")
public class Role {

    @Column(name = "ROLE_ID")
    @Id
    @SequenceGenerator(name = "RoleGenerator",sequenceName = "Role_Sequence")
    @GeneratedValue(generator = "RoleGenerator" )
    private int id;

    @Column(name = "ROLE_CODE")
    private String code;

    @Column(name = "ROLE_NAME")
    private String name;

    @OneToMany(mappedBy = "role_id")
    private List<Map_role_user> map_role_userList = new ArrayList<Map_role_user>();

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


    //------------------------------------------------------------------------------------


    public List<Map_role_user> getMap_role_userList() {
        return map_role_userList;
    }

    public void setMap_role_userList(List<Map_role_user> map_role_userList) {
        this.map_role_userList = map_role_userList;
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
}
