package com.exercicios.projeto_lista_encadeada;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(1));

        System.out.println(minhaListaEncadeada);

    }
}