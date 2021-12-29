package com.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNum = new int[20];

        for (int i=0; i<randomNum.length;i++){
            int numero = random.nextInt(100);
            randomNum[i] = numero;
        }
        System.out.println("Numeros aleatorios: ");
        for (int numero:randomNum) {
            System.out.print(numero +" ");
        }

        System.out.println("\nSucessor dos numeros aleatorios: ");
        for (int numero:randomNum) {
            System.out.print((numero+1) +" ");
        }
        System.out.println("\nAntecessor dos numeros aleatorios: ");
        for (int numero:randomNum) {
            System.out.print((numero-1) +" ");
        }
    }
}
