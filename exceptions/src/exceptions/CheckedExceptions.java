package exceptions;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class CheckedExceptions {

    public static void main(String[] args) {
        String nomeDoArquivo = "witcher-andrzej-sapkowski.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException var7) {
            JOptionPane.showMessageDialog((Component)null, "Revise o nome do arquivo que você deseja imprimir! " + var7.getCause());
            var7.printStackTrace();
        } catch (IOException var8) {
            JOptionPane.showMessageDialog((Component)null, "Ocorreu um erro inesperado! Entre em contato com o suporte! " + var8.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);

        bw.flush();
        br.close();
    }

}
