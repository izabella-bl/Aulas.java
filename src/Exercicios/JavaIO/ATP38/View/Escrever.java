package Exercicios.JavaIO.ATP38.View;

import java.io.*;


public class Escrever {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("src/ATP38/Dados/Pratos.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Risotto\n");
            bw.write("Dobradinha\n");

            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Não foi possivel encontrar esse arquivo");
        } catch (IOException e) {
            System.out.println("Não é possivel escrever no arquivo");
        }
    }
}
