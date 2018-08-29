package itsol.intership02.Impl;

import itsol.intership02.StaffService;
import itsol.intership02.dao.StaffDAO;
import itsol.intership02.entities.Staff;
import itsol.intership02.generic.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private GenericRepository genericRepository;

    @Autowired
    private StaffDAO staffDAO;

    @Override
    public List<Object> getOne(List params) {
        return null;
    }

    @Override
    public List<Object> getAll(List params) {
        return genericRepository.getEntityFromPackage("pgk_staff.get_all_staff",params);
    }

    @Override
    public void update(Staff staff) {

    }

    @Override
    public void delete(List params) {
    }

    @Override
    public void insert(Staff staff) {

    }
}
