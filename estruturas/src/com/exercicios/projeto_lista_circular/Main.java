package com.exercicios.projeto_lista_circular;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> minhaListaCirc = new ListaCircular<>();

        minhaListaCirc.add("c0");
        System.out.println(minhaListaCirc);

        minhaListaCirc.remove(0);
        System.out.println(minhaListaCirc);

        minhaListaCirc.add("c1");
        System.out.println(minhaListaCirc);

        minhaListaCirc.add("c2");
        minhaListaCirc.add("c3");
        System.out.println(minhaListaCirc);

//        System.out.println(minhaListaCirc.get(0));
//        System.out.println(minhaListaCirc.get(1));
//        System.out.println(minhaListaCirc.get(2));
//        System.out.println(minhaListaCirc.get(3));

        for (int i=0;i<20;i++){
            System.out.println(minhaListaCirc.get(i));
        }

    }
}
