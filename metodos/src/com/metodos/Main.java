package com.metodos;

import com.metodos.exercicio1.Calculadora;
import com.metodos.exercicio1.Emprestimo;
import com.metodos.exercicio1.Mensagem;
import com.metodos.exercicio1.Quadrilatero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao;
        boolean shouldBreak = false;
        Scanner scan = new Scanner(System.in);
        inicio:
        while (!shouldBreak) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Calculadora");
            System.out.println("2 - Horário");
            System.out.println("3 - Simular emprestimo");
            System.out.println("4 - Área do quadrilatero");
            System.out.println("5 - Encerrar aplicação");
            opcao = scan.nextInt();
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
                case 4 -> {
                    // Área quadrilatero
                    System.out.println("Exercício quadrilátero");
                    System.out.println("Selecione a forma geométrica cuja área será calculada: ");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Trapézio");
                    System.out.println("4 - Losango");
                    System.out.println("5 - Retornar para o menu anterior");
                    int opcaoQuad = scan.nextInt();
                    switch (opcaoQuad) {
                        case 1 -> {
                            double lado;
                            System.out.println("Digite o valor do lado do quadrado: ");
                            lado = scan.nextDouble();
                            Quadrilatero.area(lado);
                            break inicio;
                        }
                        case 2 -> {
                            double lado1, lado2;
                            System.out.println("Digite o valor do primeiro lado do retangulo: ");
                            lado1 = scan.nextDouble();
                            System.out.println("Digite o valor do segundo lado do retangulo: ");
                            lado2 = scan.nextDouble();
                            Quadrilatero.area(lado1, lado2);
                            break inicio;
                        }
                        case 3 -> {
                            double baseMaior, baseMenor, altura;
                            System.out.println("Digite o valor da base maior do trapézio: ");
                            baseMaior = scan.nextDouble();
                            System.out.println("Digite o valor da base menor do trapézio: ");
                            baseMenor = scan.nextDouble();
                            System.out.println("Digite o valor da altura do trapézio: ");
                            altura = scan.nextDouble();
                            Quadrilatero.area(baseMaior, baseMenor, altura);
                            break inicio;
                        }
                        case 4 -> {
                            float diagonal1, diagonal2;
                            System.out.println("Digite o valor da primeira diagonal do losango: ");
                            diagonal1 = scan.nextFloat();
                            System.out.println("Digite o valor da segunda diagonal do losango: ");
                            diagonal2 = scan.nextFloat();
                            Quadrilatero.area(diagonal1, diagonal2);
                            break inicio;
                        }
                        default -> {
                            System.out.println("Opção inválida");
                            break inicio;
                        }

                    }

                }
                case 5 -> {
                    System.out.println("Encerrando aplicação...");
                    shouldBreak=true;
                    break inicio;
                }
                default -> {
                    System.out.println("Opção inválida.");
                    break inicio;
                }
            }
        }
    }
}
