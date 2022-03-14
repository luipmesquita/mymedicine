package com.company.ui;

import com.company.model.Doctor;
import com.company.model.MyMedicine;
import com.company.model.Person;

public class UIDoctor {

    public static void mainDoctor(MyMedicine myMedicine, Doctor doctor){

        int op;

        do {
            op = menuDoctor();

            switch (op){
                case 1 -> doctor.listPacients();
                case 2 -> System.out.println("One pacient");
                case 3 -> System.out.println("Appointments");
                case 4 -> addPacient(myMedicine, doctor);
                case 5 -> System.out.println("Remove");
                default -> System.out.println("ERROR: Wrong option!");
            }

        }while (op!=0);
    }

    public static void addPacient(MyMedicine myMedicine, Doctor doctor){

        int number;
        Person person;


        System.out.print("Paciente Health Number: ");
        number = (int) UIGeral.getNumber();

        person = myMedicine.searchPersonByHealthnumber(number);

        if (person == null){
            System.out.print("\nERROR: wrong number or pacient doens't exist!\n");
        } else {
            doctor.addPersonToDoctor(person);
            System.out.print("Pacient " + person.getUsername() + " added!\n");
        }

    }

    public static int menuDoctor(){

        int op;

        do {
            System.out.println("\n*** Welcome Doctor ***\n");
            System.out.println("1 - See all pacients");
            System.out.println("2 - See single pacient");
            System.out.println("3 - See future appoitments");
            System.out.println("4 - Add pacient");
            System.out.println("5 - Remove pacient");
            System.out.println("0 - Exit\n");

            System.out.print("Chose option: ");
            op = (int) UIGeral.getNumber();

            if (op != 1 && op != 2 && op != 3 && op != 4 && op != 5 && op !=0) {
                System.out.println("\nERROR: Chose number 0, 1, 2, 3, 4 or 5.\n");
            }
        }while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5 && op !=0);

        return op;
    }
}
