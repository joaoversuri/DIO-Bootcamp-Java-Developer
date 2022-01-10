package exceptions;

import javax.swing.*;

public class CustomException_2 {

    public static void main(String[] args) {
        int[] numerador = new int[]{4, 5, 8, 10};
        int[] denominador = new int[]{2, 4, 0, 2, 8};

        for(int i = 0; i < denominador.length; ++i) {
            try {
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
                if (numerador[i]%2!=0) {
                    throw new DivisaoNaoExataException("Divisão não exata!",numerador[i], denominador[i]);
                }
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "O Cálculo não pode ser realizado! "+e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"Utilizando posição fora dos limites do array! "+e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("O programa continua...");
    }
}
class DivisaoNaoExataException extends Exception {
    private int numerado;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
}
