package exceptions;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class CustomException_1 {

    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");
        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while(line != null); 

            bw.flush();
            br.close();
        } catch (ImpossivelAbrirArquivoException var4) {
            JOptionPane.showMessageDialog((Component)null, var4.getMessage());
        } catch (IOException var5) {
            JOptionPane.showMessageDialog((Component)null, "Ocorreu um erro não esperado, por favor, fale com o suporte." + var5.getMessage());
            var5.printStackTrace();
        }

    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAbrirArquivoException {
        File file = new File(nomeDoArquivo);

        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException var3) {
            throw new ImpossivelAbrirArquivoException(file.getName(), file.getPath());
        }
    }

}

class ImpossivelAbrirArquivoException extends Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAbrirArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }
}
