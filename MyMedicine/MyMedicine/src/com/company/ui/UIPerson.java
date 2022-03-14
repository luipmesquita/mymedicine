package com.company.ui;

import com.company.model.MyMedicine;
import com.company.model.Person;

public class UIPerson {

    public static void mainPerson(MyMedicine myMedicine, Person person){

        int op;
        op = menuPerson();

        System.out.println("");

    }

    public static int menuPerson(){

        int op;
        do {
            System.out.println("\n*** User Menu ***\n");
            System.out.println("1 - See exam results");
            System.out.println("2 - See appointments");
            System.out.println("3 - See pescriptions");
            System.out.println("4 - See analisys results");
            System.out.println("0 - Back to main menu");
            op = (int) UIGeral.getNumber();

        }while (op!=0 && op!=1 && op!=2 && op!=3 && op!=4);

        return op;
    }
}
