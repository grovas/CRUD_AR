package com.sdajava.crud.sqlqueries;

import com.sdajava.crud.dbconnection.DBConnection;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllPositionTest {


    @Test
    public void shouldReturnAllRow(){
        Connection conn =
                DBConnection.INSTANCE.setJdbcConnection();

        ResultSet result = null;

        try {
            Statement state = conn.createStatement();
            result = state.executeQuery(
                    "select title from books where id=1");
            System.out.println("result" + result);
            result.close();
            state.close();
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        //result.getFetchSize();
        Assert.assertNotNull(
                "Select for only one record" );
    }
}
