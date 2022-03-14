package com.company.model;

import java.util.ArrayList;
public class Doctor extends Person{

    private String specialty;
    private long id;
    private ArrayList<Person> listOfPacients;

    public Doctor(String name, int healthNumber, Date date, String username, String password, String specialty, MyMedicine myMedicine) {
        super(name, healthNumber, date, username, password);
        this.specialty = specialty;
        setId(myMedicine);
        this.listOfPacients = new ArrayList<>();
    }

    public Doctor(){}

    public String getSpeciality() {
        return specialty;
    }

    public void setSpeciality(String speciality) {
        this.specialty = speciality;
    }

    public long getId() {
        return id;
    }

    public void setId(MyMedicine myMedicine) {
        this.id = myMedicine.getTotalNumberOfDoctors()+1;
    }

    public ArrayList<Person> getListOfPacients() {
        return listOfPacients;
    }

    public void addPersonToDoctor(Person person){
        this.listOfPacients.add(person);
    }

    public void listPacients() {
        for (Person person: this.listOfPacients){
            System.out.println(person.toString());
        }
    }

    @Override
    public String toString() {
        return "Doctor: " + "[" + id + "] " + super.getName() + ", " + (2022-super.getBirthday().getYear()) + ", " + specialty;
    }
}
