package com.sdajava.crud.sqlqueries;

import com.sdajava.crud.dbconnection.DBConnection;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.sdajava.crud.sqlqueries.DeletePosition.sqlDeleteRow;
import static org.junit.Assert.assertTrue;

public class DeletePositionTest {

    private DBConnection dbConnection;
    private static String sqlDelete = "DELETE FROM books WHERE title=?";
    @Before
    public void before(){
        Connection connection
                = DBConnection.INSTANCE.setJdbcConnection();

        try{
            PreparedStatement stateUpdate = connection.prepareStatement(sqlDelete);

            stateUpdate.setString(1, "Nowy tytul");
            stateUpdate.setString(2, "Nowy autor");
            stateUpdate.setDouble(3, 22.33);
            stateUpdate.setInt(4, 444);

            stateUpdate.executeUpdate();
            stateUpdate.close();
            connection.close();
        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    @Test
    public void shouldReturnTrueIfRemoveRowIsOK(){
        boolean delRow = sqlDeleteRow(sqlDelete);
        assertTrue(delRow);
    }

}