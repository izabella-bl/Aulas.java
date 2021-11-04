package Exercicios.JavaIO.ATP39.View;

import java.io.*;

public class Escrita {
    public static void main(String[] args)  {
        try {
            InputStream fis = System.in;
            Reader pessoa = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(pessoa);

            OutputStream osw = new FileOutputStream("src/Exercicios/JavaIO/ATP39/Dados/Pessoa.txt");
            Writer nome = new OutputStreamWriter(osw);
            BufferedWriter bw = new BufferedWriter(nome);

            for (int i = 0; i <= 5; i++) {
               String nomes = br.readLine();
               bw.write(nomes+"\n");
            }

            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Não possui esse arquivo");;
        } catch (IOException e) {
            System.out.println("Não foi possivel fazer essa ação.");
        }

    }
}
