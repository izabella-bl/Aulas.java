package Exercicios.JavaIO.ATP39.View;

import java.io.*;

public class Escrita3 {
    public static void main(String[] args) {
        try{
            InputStream fis = new FileInputStream("P2/dados/molhos.txt");
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("P2/dados/molhos2.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
