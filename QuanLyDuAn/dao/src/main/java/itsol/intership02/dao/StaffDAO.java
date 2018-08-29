package itsol.intership02.dao;


import itsol.intership02.entities.Staff;
import itsol.intership02.generic.CustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface StaffDAO extends JpaRepository<Staff,Integer>,CustomRepository {

    Optional<Staff> findByUsername(String username);

    Optional<Staff> findByStaffcode(String code);

    boolean existsByUsername(String username);

    @Procedure(procedureName = "pgk_staff.delete_staff")
    void deleteStaff(@Param("p_staff_code") String p_staff_id, @Param("p_person_update")String p_person_update);




}
