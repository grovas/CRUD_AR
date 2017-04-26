package com.sdajava.crud.sqlqueries;

import com.sdajava.crud.dbconnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddNewPosition {
    public static void sqlInsertRow() {
        Connection connection
                = DBConnection.INSTANCE.setJdbcConnection();
        Scanner scanner = new Scanner(System.in);
        String sqlUpdate = "INSERT INTO books (title,author,price, page_count) values (?,?,?,?)";
            try {
            PreparedStatement stateUpdate = connection.prepareStatement(sqlUpdate);
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
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
