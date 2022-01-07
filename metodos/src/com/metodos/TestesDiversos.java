package com.metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestesDiversos {
    public static void main(String[] args) throws IOException {
//===================== BufferedReader + StringTokenizer ==============================
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada
//        int xpto = Integer.parseInt(st.nextToken());
//======================================================================================

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a+b);

/*        if (ddd==61) System.out.println("Brasilia\n");
        else if (ddd==71) System.out.println("Salvador\n");
        else if (ddd==11) System.out.println("Sao Paulo\n");
        else if (ddd==21) System.out.println("Rio de Janeiro\n");
        else if (ddd==32) System.out.println("Juiz de Fora\n");
        else if (ddd==19) System.out.println("Campinas\n");
        else if (ddd==27) System.out.println("Vitoria\n");
        else if (ddd==31) System.out.println("Belo Horizonte\n");
        else System.out.println("DDD nao cadastrado\n");*/

/*        switch(ddd){
            case 61 -> System.out.println("Brasilia\n");
            case 71 -> System.out.println("Salvador\n");
            case 11 -> System.out.println("Sao Paulo\n");
            case 21 -> System.out.println("Rio de Janeiro\n");
            case 32 -> System.out.println("Juiz de Fora\n");
            case 19 -> System.out.println("Campinas\n");
            case 27 -> System.out.println("Vitoria\n");
            case 31 -> System.out.println("Belo Horizonte\n");
            default -> System.out.println("DDD nao cadastrado\n");
        }*/
    }
}