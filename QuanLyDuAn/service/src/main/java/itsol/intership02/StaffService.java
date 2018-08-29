package itsol.intership02;

import itsol.intership02.entities.Staff;

import java.util.List;

public interface StaffService {

    List<Object> getOne(List params);
    List<Object> getAll(List params);
    void update (Staff staff);
    void delete (List params);
    void insert (Staff staff);

}
