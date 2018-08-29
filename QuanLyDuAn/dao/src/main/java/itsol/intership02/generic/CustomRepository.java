package itsol.intership02.generic;

import java.util.List;

public interface CustomRepository {
    <T> List<T> getOne(List<T> params);
    <T> List<T> getList(List<T> params);
    <T> void executeSP(List<T> params);

}
