package com.company.model;

import com.company.exception.DateInvalidException;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) throws DateInvalidException{
        boolean isValide;
        isValide = isValide(day, month, year);
        if (isValide) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else{
            throw new DateInvalidException(day+"/"+month+"/"+year+"/"+"ERROR! Invalid date.");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isBissexto(int year){

        boolean bissexto = false;

        if(year % 4 == 0){
            bissexto = true;
        }

        return bissexto;
    }

    public boolean isValide(int day, int month, int year) {

        boolean valido = false;
        boolean bissexto;

        if (month == 1 || month == 3 || month == 5 || month == 7 ||  month == 8 ||  month == 10 ||  month == 12){
            if (day<=31 && day>=1){
                valido = true;
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11){
            if (day<=30 && day>=1){
                valido = true;
            }
        }

        if (month == 2){
            bissexto = isBissexto(year);
            if (bissexto){
                if (day<=29 && day>=1){
                    valido = true;
                }
            } else {
                if (day<=28 && day>=1){
                    valido = true;
                }
            }
        }

        return valido;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
