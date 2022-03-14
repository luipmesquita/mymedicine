package com.company.ui;

import com.company.exception.DateInvalidException;
import com.company.model.Date;

public class UIDate {

    public static Date getDate() {
        boolean flag;
        Date date = null;
        do {
            try {
                flag = false;
                System.out.println("Insert birthdate:");

                System.out.print("Dia: ");
                int dia = (int) UIGeral.getNumber();
                System.out.print("Mês: ");
                int mes = (int) UIGeral.getNumber();
                System.out.print("Ano: ");
                int ano = (int) UIGeral.getNumber();

                date = new Date(dia, mes, ano);
            } catch (DateInvalidException e) {
                flag = true;
            }
        } while (flag);
        return date;
    }
}
