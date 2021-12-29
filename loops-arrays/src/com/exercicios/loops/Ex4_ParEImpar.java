package com.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int quantNum;
        int contNum = 0;
        int contPar = 0;
        int contImpar = 0;

        System.out.println("Digite a quantidade de numeros a serem contados: ");
        quantNum = scan.nextInt();
        do{
            contNum++;
            System.out.println("Número: ");
            numero= scan.nextInt();
            if (numero%2==0) contPar++;
            else contImpar++;
        }while(contNum < quantNum);
        System.out.println();
        System.out.println("Quantidade de pares: "+contPar);
        System.out.println("Quantidade de ímpares: "+contImpar);
        System.out.println();
        System.out.println("Encerrando...");
    }
}
