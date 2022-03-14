package com.company.model;
import com.company.exception.HealthNumberInvalidoException;

public class Person {

    private String name;
    private int healthNumber;
    private Date birthday;
    private String username;
    private String password;

    public Person(String name, int healthNumber, Date birthday, String username, String password) {
        this.name = name;
        setHealthNumber(healthNumber);
        this.birthday = birthday;
        this.username = username;
        this.password = password;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getHealthNumber() {
        return healthNumber;
    }

    public void setHealthNumber(int healthNumber) throws HealthNumberInvalidoException {
        if (healthNumber>100000000 && healthNumber<999999999) {
            this.healthNumber = healthNumber;
        } else{
            throw new HealthNumberInvalidoException(healthNumber + ": ERROR! Invalid health number.");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Pacient: " + "[" + healthNumber + "] " + name + ", " + (2022-birthday.getYear());
    }
}
