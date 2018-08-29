package itsol.intership02.dao;

import itsol.intership02.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role,Integer> {
}
