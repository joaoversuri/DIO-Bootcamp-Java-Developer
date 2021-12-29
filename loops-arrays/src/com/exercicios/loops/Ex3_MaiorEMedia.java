package com.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        int maior = 0;
        int soma = 0;
int numero;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero>maior) maior=numero;
            soma+=numero; //soma = soma + numero
            cont++; //cont = cont + 1
        }
        while(cont<5);
        System.out.println();
        System.out.println("Maior número: "+maior);
        System.out.println("Média: "+(soma/5));
        System.out.println();
        System.out.println("Encerrando...");
    }
}
