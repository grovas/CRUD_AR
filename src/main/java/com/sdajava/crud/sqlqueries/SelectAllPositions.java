package com.sdajava.crud.sqlqueries;

import com.sdajava.crud.dbconnection.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllPositions {

    public static ResultSet sqlSelectAll (String sql) {
        Connection connection
                = DBConnection.setJdbcConnection();
        ResultSet resultSet = null;

        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            printSQLResult(resultSet);
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultSet;
    }

    public static void printSQLResult(ResultSet result) throws SQLException {
        ResultSet resultSet = result;
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
    }
}
