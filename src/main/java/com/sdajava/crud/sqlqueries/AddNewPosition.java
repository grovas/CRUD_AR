package com.sdajava.crud.sqlqueries;

import com.sdajava.crud.dbconnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddNewPosition {
    public static void sqlInsertRow(String sql) {
        Connection connection = DBConnection.setJdbcConnection();
        Scanner scanner = new Scanner(System.in);
        try {
            PreparedStatement stateUpdate = connection.prepareStatement(sql);
            System.out.println("Podaj tytuł ksiazki: ");
            String title = scanner.nextLine();
            stateUpdate.setString(1, title);
            System.out.println("Podaj autora: ");
            String author = scanner.nextLine();
            stateUpdate.setString(2, author);
            System.out.println("Podaj cenę: ");
            double newPrice = scanner.nextDouble();
            stateUpdate.setDouble(3, newPrice);
            System.out.println("Podaj liczbę stron: ");
            int pageCount = scanner.nextInt();
            stateUpdate.setInt(4, pageCount);

            stateUpdate.executeUpdate();
            stateUpdate.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
