package itsol.intership02.generic;

import java.util.List;

public interface CustomAdvancedRepository{
    <T> void addNew(List<T> params);
    <T> List<T> pay(List<T> params);
    <T> void update(List<T> params);

}
