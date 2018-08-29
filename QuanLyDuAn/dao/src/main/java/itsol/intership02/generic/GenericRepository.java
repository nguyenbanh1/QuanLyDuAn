package itsol.intership02.generic;

import java.util.List;

public interface GenericRepository {

    <T> List<T> getEntityFromPackage(final String spName, List<T> params);
    <T> void executeStoredProcedure(final String spName, List<T> params);
}
