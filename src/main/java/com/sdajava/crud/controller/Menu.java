package com.sdajava.crud.controller;

import com.sdajava.crud.sqlqueries.*;
import com.sdajava.crud.view.GUI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void mainMenu () throws Exception {
        int option = 0;
        Scanner in = new Scanner(System.in);

        boolean optionFlag = true;

        while (optionFlag) {
            GUI.showMenu();
            boolean flag = true;

            while (flag) {
                try {
                    option = in.nextInt();
                    flag = false;
                } catch (InputMismatchException e) {
                    System.out.println("Podaj prawidłową wartość menu");
                    in.next();
                }
            }

            switch (option) {
                case 1: SelectAllPositions.sqlSelectAll(); break;
                case 2: UpdatePosition.sqlUpdateRow();
                        System.out.println("Uaktualniasz cene ksiazki"); break;
                case 3: AddNewPosition.sqlInsertRow(); break;
                case 4: DeletePosition.sqlDeleteRow(); break;
                case 0: optionFlag = false; break;
            }
        }
    }
}
