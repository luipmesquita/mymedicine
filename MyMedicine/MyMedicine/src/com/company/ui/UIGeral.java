package com.company.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UIGeral {

    public static long getNumber(){

        Scanner scanner = new Scanner(System.in);
        long op = -1;
        boolean flag;

        do {
            try {
                op = scanner.nextLong();
                flag = true;
            } catch (InputMismatchException e) {
                scanner.next();
                flag = false;
                System.out.println("ERROR: Invalid input! Please chose a correct number.");
                System.out.print("New number: ");
            }
        }while (!flag);

        return op;
    }

    public static String getText(){

        Scanner scanner = new Scanner(System.in);
        String text;
        text= scanner.nextLine();

        return text;
    }
}
