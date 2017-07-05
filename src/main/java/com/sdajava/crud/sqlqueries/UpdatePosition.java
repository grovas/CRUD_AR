package com.sdajava.crud.sqlqueries;

import com.sdajava.crud.dbconnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdatePosition {
    public static void sqlUpdateRow (String sql) {
        Connection connection
                = DBConnection.INSTANCE.setJdbcConnection();
        Scanner scanner = new Scanner(System.in);
        try {
            PreparedStatement stateUpdate = connection.prepareStatement(sql);
            System.out.println("Podaj id ksiazki do edycji: ");
            int idRow = scanner.nextInt();
            stateUpdate.setInt(2, idRow);
            System.out.println("Podaj nowa cenę: ");
            double newPrice = scanner.nextDouble();
            stateUpdate.setDouble(1, newPrice);

            stateUpdate.executeUpdate();
            stateUpdate.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
