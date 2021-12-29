package com.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Inserir nota: ");
        nota = scan.nextInt();

        while(nota<0||nota>10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota inserida: "+nota);
        System.out.println();
        System.out.println("Encerrando...");
    }
}
