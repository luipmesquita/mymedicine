package com.company.ui;

import com.company.exception.HealthNumberInvalidoException;
import com.company.model.Date;
import com.company.model.Doctor;
import com.company.model.MyMedicine;
import com.company.model.Person;

public class UIRegister {

    public static void mainRegister(MyMedicine myMedicine){

        Person person = new Person();
        Doctor doctor = new Doctor();

        String name;
        int healthNumber;
        Date date;
        String username;
        String password;
        String specialty;

        String op;
        boolean flag;

        System.out.println("\n*** New Register ***\n");
        System.out.print("Insert full name: ");
        name = UIGeral.getText();
        person.setName(name);

        do {
            try {
                flag = true;
                System.out.print("Insert health number: ");
                healthNumber = (int) UIGeral.getNumber();
                person.setHealthNumber(healthNumber);
            }catch (HealthNumberInvalidoException e){
                flag = false;
            }
        }while (!flag);

        date = UIDate.getDate();
        person.setBirthday(date);

        System.out.print("Insert username: ");
        username = UIGeral.getText();
        person.setUsername(username);

        System.out.print("Insert password: ");
        password = UIGeral.getText();
        person.setPassword(password);

        do {
            System.out.print("Doctor[y/n]: ");
            op = UIGeral.getText();
            if (op.equals("y") || op.equals("Y")) {
                flag = true;
                System.out.print("Insert specialty: ");
                specialty = UIGeral.getText();
                doctor.setSpeciality(specialty);
                doctor.setId(myMedicine);
                myMedicine.addPeople(doctor);
            } else if (op.equals("n") || op.equals("N")) {
                flag = true;
                myMedicine.addPeople(person);
            } else {
                flag = false;
            }
        }while (!flag);

    }
}
