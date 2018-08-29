package itsol.intership02.generic;

/**
 * [ShoppingOnline] Truy xuất stored procedure trong package
 * @author          PhatNT
 * @since           02/07/2018
 * @require         Yêu cầu tham số REF_CURSOR nằm ở vị trí cuối cùng của Stored Procedure
 * @Example         PACKAGE_STAFF.GET_ONE_STAFF(tham số 1,..., tham số n, tham số REF_CURSOR)
 **/

import oracle.jdbc.OracleTypes;
import org.hibernate.Session;
import org.hibernate.internal.SessionImpl;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;

@Repository
public class GenericRepositoryImpl implements GenericRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public <T> List<T> getEntityFromPackage(final String spName, List<T> params) {
        Session session = entityManager.unwrap(Session.class);
        List<T> listTmp = null;

        //Prepared SQL Execute
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{call ");
        stringBuilder.append(spName);
        int numParam = params.size();

        if(numParam > 0){
            stringBuilder.append("(?");
            for(int i = 1; i <= numParam; i++){
                stringBuilder.append(", ?");
            }
            stringBuilder.append(")");
        }
        stringBuilder.append("}");

        try {
            Connection conn = ((SessionImpl)session).connection();
            CallableStatement callableStatement = conn.prepareCall(stringBuilder.toString());
            int cursorIndex = 0;
            if(numParam > 0){
                for (int c = 0; c < numParam; c++){
                    cursorIndex = c + 1;
                    callableStatement.setObject(cursorIndex, params.get(c));
                }

                cursorIndex++;
                callableStatement.registerOutParameter(cursorIndex, OracleTypes.CURSOR);
            }

            callableStatement.executeUpdate();
            ResultSet rs = (ResultSet) callableStatement.getObject(cursorIndex);
            ResultSetMetaData metaData = rs.getMetaData();
            int columns = metaData.getColumnCount();

            listTmp = new ArrayList<>();
            while(rs.next()){
                LinkedHashMap<String, T> listItem = new LinkedHashMap<String, T>();
                for (int i = 1; i <= columns; i++)
                {
                    String key = metaData.getColumnName(i);
                    T value = (T) rs.getObject(key);
                    listItem.put(key, value);
                }
                listTmp.add((T) listItem);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        } finally {
            session.clear();
        }
        return listTmp;
    }

    @Override
    public <T> void executeStoredProcedure(String spName, List<T> params) {
        Session session = entityManager.unwrap(Session.class);

        //Prepared SQL Execute
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{call ");
        stringBuilder.append(spName);
        int numParam = params.size();

        if(numParam > 0){
            stringBuilder.append("(?");
            for(int i = 1; i < numParam; i++){
                stringBuilder.append(", ?");
            }
            stringBuilder.append(")");
        }
        stringBuilder.append("}");

        try {
            Connection conn = ((SessionImpl)session).connection();
            CallableStatement callableStatement = conn.prepareCall(stringBuilder.toString());
            int index = 0;
            if(numParam > 0){
                for (int c = 0; c < numParam; c++){
                    index = c + 1;
                    callableStatement.setObject(index, params.get(c));
                }
            }

            callableStatement.executeUpdate();

        }catch (Exception ex){
            ex.printStackTrace();
        } finally {
            session.clear();
        }
    }
}
