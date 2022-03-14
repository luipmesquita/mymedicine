package com.company;

import com.company.model.Date;
import com.company.model.Doctor;
import com.company.model.MyMedicine;
import com.company.model.Person;
import com.company.ui.UIGeral;
import com.company.ui.UILogin;
import com.company.ui.UIRegister;

public class Main {

    public static void main(String[] args) {

        MyMedicine myMedicine = new MyMedicine("MyMedicine");
        Date date1 = new Date(4,12,2001);
        Date date2 = new Date(2,5,1995);
        Doctor doctor = new Doctor("Luís Mesquita", 123123123, date1,"LuisMesquita", "123", "Family Doctor", myMedicine);
        Person person = new Person("Pedro Miranda", 321321321, date2, "LuisMiranda", "456");
        myMedicine.addPeople(doctor);
        myMedicine.addPeople(person);
        doctor.addPersonToDoctor(person);

        int op;

        do {
            op = mainMenu();

            switch (op) {
                case 1 -> UILogin.mainLogin(myMedicine);
                case 2 -> UIRegister.mainRegister(myMedicine);
                case 3 -> myMedicine.showAllUsers();
                case 0 -> System.out.println("Program ended! Goodbye.");
                default -> System.out.println("ERROR: Wrong option!");
            }

        }while (op!=0);
    }

    public static int mainMenu(){

        int op;

        do {
            System.out.println("\n*** WELCOME TO MyMedicine ***\n");
            System.out.println("1 - Login");
            System.out.println("2 - Register");
            System.out.println("3 - Show all users");
            System.out.println("0 - Exit\n");

            System.out.print("Chose option: ");
            op = (int) UIGeral.getNumber();

            if (op!=1 && op!=2 && op!=0 && op!=3){
                System.out.println("\nERROR: Chose number 0, 1, 2 or 3.");
            }

        }while (op!=1 && op!=2 && op!=0 && op!=3);

        return op;
    }
}
