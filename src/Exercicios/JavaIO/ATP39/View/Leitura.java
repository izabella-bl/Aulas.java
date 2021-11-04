package Exercicios.JavaIO.ATP39.View;

import java.io.*;

public class Leitura {

    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("src/Exercicios/JavaIO/ATP39/Dados/Pessoa.txt");
        Reader nomes =new InputStreamReader(is);
        BufferedReader br = new BufferedReader(nomes);

        OutputStream os = System.out;
        Writer pessoas = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(pessoas);

        while(br.ready()){
             String nome = br.readLine();
            System.out.println(nome);
        }

        br.close();

    }
}
