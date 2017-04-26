package com.sdajava.crud.sqlqueries;

import com.sdajava.crud.dbconnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePosition {
    public static void sqlDeleteRow() {
        Connection connection
                = DBConnection.INSTANCE.setJdbcConnection();
        Scanner scanner = new Scanner(System.in);
        String sqlDelete = "DELETE FROM books WHERE id=?";
        try {
            PreparedStatement stateUpdate = connection.prepareStatement(sqlDelete);
            System.out.println("Podaj id ksiazki do usuniecia: ");
            int idRow = scanner.nextInt();
            stateUpdate.setInt(1, idRow);

            stateUpdate.executeUpdate();
            stateUpdate.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
