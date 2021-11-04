package Exercicios.JavaIO.ATP38.View;

import java.io.*;

public class Leitura {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/ATP38/Dados/TipoDeComida.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while (br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Não é possivel ler essa arquivo");
        }
    }
}
