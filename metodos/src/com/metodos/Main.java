package com.metodos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        inicio:while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Calculadora");
            System.out.println("2 - Horário");
            System.out.println("3 - Simular emprestimo");
            System.out.println("4 - Área do quadrilatero");
            System.out.println("Q - Encerrar aplicação");
            String opcao = scan.next();
            switch (opcao) {
                case "1" -> {
                    // Calculadora
                    System.out.println("Exercício calculadora");
                    System.out.println("Digite 2 números e selecione a operação a ser realizada");
                    System.out.println();
                    calculadora:while(true) {
                        System.out.println("Digite o primeiro valor:");
                        double numero1= scan.nextDouble();
                        System.out.println("Digite o segundo valor:");
                        double numero2= scan.nextDouble();
                        System.out.println("Selecione a operação:");
                        System.out.println("1 - Adição");
                        System.out.println("2 - Subtração");
                        System.out.println("3 - Multiplicação");
                        System.out.println("4 - Divisão");
                        System.out.println("R - Retornar ao menu anterior");
                        String operacao = scan.next();
                        System.out.println();
                        switch (operacao) {
                            case "1" -> {
                                Calculadora.soma(numero1, numero2);
                                break calculadora;
                            }
                            case "2" -> {
                                Calculadora.subtracao(numero1, numero2);
                                break calculadora;
                            }
                            case "3" -> {
                                Calculadora.multiplicacao(numero1, numero2);
                                break calculadora;
                            }
                            case "4" -> {
                                Calculadora.divisao(numero1, numero2);
                                break calculadora;
                            }
                            case "R","r" ->{
                                break calculadora;
                            }
                            default -> System.out.println("Seleção inválida");
                        }
                    }
                    System.out.println();
                }
                case "2" -> {
                    // Mensagem
                    System.out.println("Exercício mensagem");
                    System.out.println();
                    Mensagem.obterMensagem();
                    System.out.println();
                }
                case "3" -> {
                    // Empréstimo
                    double valorUsuario;
                    int parcelas;
                    System.out.println("Exercício empréstimo");
                    System.out.println("Valor a ser financiado: ");
                    valorUsuario = scan.nextDouble();
                    System.out.println("Numero de parcelas (2 ou 3): ");
                    parcelas = scan.nextInt();
                    System.out.println();
                    Emprestimo.calcular(valorUsuario, parcelas);
                    System.out.println();
                }
                case "4" -> {
                    // Área quadrilatero
                    System.out.println("Exercício quadrilátero");
                    quadrilatero:while(true){
                        System.out.println("Selecione a forma geométrica cuja área será calculada: ");
                        System.out.println("1 - Quadrado");
                        System.out.println("2 - Retângulo");
                        System.out.println("3 - Trapézio");
                        System.out.println("4 - Losango");
                        System.out.println("R - Retornar ao menu anterior");
                        String opcaoQuad = scan.next();
                        switch (opcaoQuad) {
                            case "1" -> {
                                double lado;
                                System.out.println("Digite o valor do lado do quadrado: ");
                                lado = scan.nextDouble();
                                double areaQuadrado=Quadrilatero.area(lado);
                                System.out.println();
                                System.out.println("Área do quadrado: "+areaQuadrado);
                                System.out.println();
                            }
                            case "2" -> {
                                double lado1, lado2;
                                System.out.println("Digite o valor do primeiro lado do retangulo: ");
                                lado1 = scan.nextDouble();
                                System.out.println("Digite o valor do segundo lado do retangulo: ");
                                lado2 = scan.nextDouble();
                                double areaRetangulo=Quadrilatero.area(lado1, lado2);
                                System.out.println();
                                System.out.println("Área do retângulo:" + areaRetangulo);
                                System.out.println();
                            }
                            case "3" -> {
                                double baseMaior, baseMenor, altura;
                                System.out.println("Digite o valor da base maior do trapézio: ");
                                baseMaior = scan.nextDouble();
                                System.out.println("Digite o valor da base menor do trapézio: ");
                                baseMenor = scan.nextDouble();
                                System.out.println("Digite o valor da altura do trapézio: ");
                                altura = scan.nextDouble();
                                double areaTrapezio=Quadrilatero.area(baseMaior, baseMenor, altura);
                                System.out.println();
                                System.out.println("Área do trapézio:" + areaTrapezio);
                                System.out.println();
                            }
                            case "4" -> {
                                float diagonal1, diagonal2;
                                System.out.println("Digite o valor da primeira diagonal do losango: ");
                                diagonal1 = scan.nextFloat();
                                System.out.println("Digite o valor da segunda diagonal do losango: ");
                                diagonal2 = scan.nextFloat();
                                float areaLosango=Quadrilatero.area(diagonal1, diagonal2);
                                System.out.println();
                                System.out.println("Área do losango:" + areaLosango);
                                System.out.println();
                            }
                            case "R","r" ->{
                                break quadrilatero;
                            }
                            default -> {
                                System.out.println();
                                System.out.println("Opção inválida");
                                System.out.println();
                            }
                        }
                    }
                }
                case "Q","q" -> {
                    System.out.println("Encerrando aplicação...");
                    break inicio;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
