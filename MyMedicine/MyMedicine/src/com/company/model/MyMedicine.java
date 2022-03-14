package com.company.model;

import com.company.exception.HealthNumberInvalidoException;

import java.lang.constant.DynamicConstantDesc;
import java.util.ArrayList;

public class MyMedicine {

    private String name;
    private ArrayList<Person> listOfPeople;

    public MyMedicine(String name) {
        this.name = name;
        this.listOfPeople = new ArrayList<Person>();
    }

    public void addPeople(Person person){

        if (person != null){
            this.listOfPeople.add(person);
        } else {
            System.out.println("ERROR: Trying to add null person!");
        }
    }

    public Person findPersonForLogin(String username, String password){

        for (Person person: this.listOfPeople){
            if(person.getUsername().equals(username) && person.getPassword().equals(password)){
                return person;
            }
        }

        return null;
    }

    public Person searchPersonByHealthnumber(int healthNumber) throws HealthNumberInvalidoException {

        if (healthNumber>100000000 && healthNumber<999999999){
            for (Person person: this.listOfPeople){
                if(person.getHealthNumber() == healthNumber){
                    return person;
                }
            }

        }else{
            throw new HealthNumberInvalidoException(healthNumber + ": ERROR! Invalid health number.");
        }

        return null;
    }


    public Doctor isDoctor(Person person){

        if (person instanceof Doctor){
            return (Doctor) person;
        }

        return null;
    }

    public void showAllUsers(){

        for (Person person: this.listOfPeople){
            System.out.println(person.toString());
        }
    }

    public int getTotalNumberOfDoctors() {

        int size = 0;

        for (Person person : this.listOfPeople) {
            if (person instanceof Doctor) {
                size = size + 1;
            }
        }

        return size;
    }
}
