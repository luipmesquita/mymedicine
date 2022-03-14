package com.company.ui;

import com.company.model.Date;
import com.company.model.Doctor;
import com.company.model.MyMedicine;
import com.company.model.Person;

import javax.print.Doc;

public class UILogin {

    public static void mainLogin(MyMedicine myMedicine){

        String username;
        String password;
        Doctor doctor;

        System.out.println("\n*** New Register ***\n");
        System.out.print("Insert username: ");
        username = UIGeral.getText();

        System.out.print("Insert password: ");
        password = UIGeral.getText();

        Person person = myMedicine.findPersonForLogin(username,password);

        if (person != null) {
            System.out.println("\nWelcome" + person.getName() + "!!");
            doctor = myMedicine.isDoctor(person);
            if (doctor!=null){
                UIDoctor.mainDoctor(myMedicine, doctor);
            }else {
                UIPerson.mainPerson(myMedicine, person);
            }
        }else {
            System.out.println("\nLogin failed!");
            System.out.println("Wrong credencials!\n");
        }
    }
}
