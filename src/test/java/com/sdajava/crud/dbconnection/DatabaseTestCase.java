package com.sdajava.crud.dbconnection;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.assertNotEquals;

public class DatabaseTestCase{


    @Test
    public void shouldReturnNullIfConnectionFail(){
        Connection conn =
                DBConnection.INSTANCE.setJdbcConnection();
        assertNotEquals(
                "Test connection to DB",
                        conn, null);
    }

    @Test
    public void checkIfSingleton(){
        DBConnection select1 = DBConnection.getInstance();
        DBConnection select2 = DBConnection.getInstance();
        System.out.println("Sprawdzanie równości obiektów");
        assertNotEquals(true, select1!=select2);
    }
}
