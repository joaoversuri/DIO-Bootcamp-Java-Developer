package com.desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2_3 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int impar = 0;
        int par = 0;
        int pos = 0;
        int neg = 0;
        List<Integer> entradas = new ArrayList<>();

//continue a solução
        for (int i=1;i<=5;i++) {
            System.out.println("Digite o "+i+"º número inteiro;");
            try{
                entradas.add(Integer.parseInt(leitor.next()));
            }catch (NumberFormatException e){
                i--;
            }
        }
        for (int entrada: entradas) {
            if (entrada%2==0){
                par++;
            }
            else {
                impar++;
            }
            if (entrada>0) pos++;
            else if (entrada<0) neg++;
        }
//insira suas variaveis corretamente
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(pos + " positivo(s)");
        System.out.println(neg + " negativo(s)");
    }

}
