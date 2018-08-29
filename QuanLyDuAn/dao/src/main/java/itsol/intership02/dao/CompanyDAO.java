package itsol.intership02.dao;

import itsol.intership02.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDAO extends JpaRepository<Company,Integer> {

}
