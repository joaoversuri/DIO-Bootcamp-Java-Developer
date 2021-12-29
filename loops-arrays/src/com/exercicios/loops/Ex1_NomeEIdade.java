package com.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Inserir nome: ");
            nome = scan.next();
            System.out.println("Inserir idade: ");
            idade = scan.nextInt();
            System.out.println("Nome inserido: "+nome);
            System.out.println("Idade inserida: "+idade);
            if (nome.equals("0")||idade==0)   break;
        }
        System.out.println("Encerrando...");
    }
}