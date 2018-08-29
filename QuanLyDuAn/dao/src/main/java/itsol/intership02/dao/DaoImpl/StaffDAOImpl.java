package itsol.intership02.dao.DaoImpl;

import itsol.intership02.generic.CustomRepository;
import itsol.intership02.generic.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StaffDAOImpl implements CustomRepository {

    @Autowired
    private GenericRepository genericRepository;

    @Override
    public <T> List<T> getOne(List<T> params) {
        return genericRepository.getEntityFromPackage("pgk_staff.get_one_staff",params);
    }

    @Override
    public <T> List<T> getList(List<T> params) {
        return genericRepository.getEntityFromPackage("pgk_staff.get_all_staff",params);
    }

    @Override
    public <T> void executeSP(List<T> params) {
        genericRepository.executeStoredProcedure("pgk_staff.delete_staff",params);
    }
}
