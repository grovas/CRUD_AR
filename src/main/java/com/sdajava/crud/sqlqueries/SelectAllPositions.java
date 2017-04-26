package com.sdajava.crud.sqlqueries;

import com.sdajava.crud.dbconnection.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllPositions {
    public static void sqlSelectAll () {
        Connection connection
                = DBConnection.INSTANCE.setJdbcConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =
                    statement.executeQuery("select * from books");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") +
                        " " + resultSet.getString("title") +
                        " " + resultSet.getString("author") +
                        " " + resultSet.getInt("page_count") +
                        " " + resultSet.getDouble("price") + " zł" +
                        " " + resultSet.getString("category") +
                        " " + resultSet.getString("isbn"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
