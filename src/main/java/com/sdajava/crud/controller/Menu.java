package com.sdajava.crud.controller;

import com.sdajava.crud.sqlqueries.*;
import com.sdajava.crud.view.GUI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void mainMenu () throws Exception {

        Scanner in = new Scanner(System.in);

        boolean optionFlag = true;

        while (optionFlag) {
            GUI.showMenu();
            boolean flag = true;
            int option = 0;

            while (flag) {
                try {
                    option = in.nextInt();
                    flag = false;
                } catch (InputMismatchException e) {
                    System.out.println("Podaj prawidłową wartość menu");
                    in.next();
                }
            }
            optionFlag = receiveInputBySwitch(option);
        }
    }

    public static boolean receiveInputBySwitch (int option) {
        String sqlDelete = "DELETE FROM books WHERE id=?";
        String sqlSelectAll = "SELECT * FROM books";
        String sqlAddNew = "INSERT INTO books (title,author,price, page_count) values (?,?,?,?)";
        String sqlUpdate = "UPDATE books SET price=? WHERE id=?";

        boolean optionFlag = true;
        switch (option) {
            case 1: SelectAllPositions.sqlSelectAll(sqlSelectAll); break;
            case 2: UpdatePosition.sqlUpdateRow(sqlUpdate);
                System.out.println("Uaktualniasz cene ksiazki"); break;
            case 3: AddNewPosition.sqlInsertRow(sqlAddNew); break;
            case 4: DeletePosition.sqlDeleteRow(sqlDelete); break;
            case 0: optionFlag = false; break;
        }
        return optionFlag;
    }
}
