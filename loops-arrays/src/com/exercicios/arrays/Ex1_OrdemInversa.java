package com.exercicios.arrays;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor ={0,-5,15,50,8,4};
        int cont=0;

        System.out.println("Vetor:");
        while(cont<=(vetor.length-1)){
            System.out.println(vetor[cont]);
            cont++;
        }
        System.out.println();
        System.out.println("Vetor invertido:");
        for (int i= (vetor.length-1);i>=0;i--){
            System.out.println(vetor[i]);
        }
    }
}
