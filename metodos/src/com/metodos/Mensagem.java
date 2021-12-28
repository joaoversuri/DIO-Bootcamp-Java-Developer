package com.metodos;

import java.util.Calendar;

public class Mensagem {


    public static void obterMensagem() {
        int hora;
        int minuto;
        Calendar cal = Calendar.getInstance();
        hora = cal.get (Calendar.HOUR_OF_DAY);
        minuto = cal.get(Calendar.MINUTE);
        System.out.println(hora+":"+minuto);

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemBomDia();
            case 13, 14, 15, 16, 17 -> mensagemBoaTarde();
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> mensagemBoaNoite();
            default -> System.out.println("Hora inválida.");
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }


}
