package com.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tab;

        System.out.println("Deseja ver a tabuada de qual número?");
        tab = scan.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(tab+" x "+i+" = "+(i*tab));
        }
        System.out.println();
        System.out.println("Encerrando...");
    }
}
