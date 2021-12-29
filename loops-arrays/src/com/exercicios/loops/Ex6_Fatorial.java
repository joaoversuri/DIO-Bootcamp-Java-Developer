package com.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial;
        int fatorado=1;

        System.out.println("Digite o numero a ser fatorado: ");
        fatorial = scan.nextInt();

        for (int i=fatorial;i>0;i--){
            fatorado=fatorado*i;
        }
        System.out.println(fatorial+"! = "+fatorado);
    }
}
