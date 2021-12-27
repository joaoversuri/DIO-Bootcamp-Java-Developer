package com.metodos;

import com.metodos.exercicio1.Calculadora;
import com.metodos.exercicio1.Emprestimo;
import com.metodos.exercicio1.Mensagem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Horário");
        System.out.println("3 - Emprestimo");
        opcao=scan.nextInt();
        switch (opcao) {
            case 1 -> {
                // Calculadora
                System.out.println("Exercício calculadora");
                Calculadora.soma(3, 6);
                Calculadora.subtracao(9, 1.8);
                Calculadora.multiplicacao(7, 8);
                Calculadora.divisao(5, 2.5);
            }
            case 2 -> {
                // Mensagem
                System.out.println("Exercício mensagem");
                Mensagem.obterMensagem();
            }
            case 3 -> {
                // Empréstimo
                double valorUsuario;
                int parcelas;
                System.out.println("Exercício empréstimo");
                System.out.println("Valor a ser financiado: ");
                valorUsuario = scan.nextDouble();
                System.out.println("Numero de parcelas (2 ou 3): ");
                parcelas = scan.nextInt();
                Emprestimo.calcular(valorUsuario, parcelas);
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
