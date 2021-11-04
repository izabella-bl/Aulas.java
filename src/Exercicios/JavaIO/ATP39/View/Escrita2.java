package Exercicios.JavaIO.ATP39.View;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Escrita2 {
    public static void main(String[] args){
        PrintWriter pw = null;

        try {
            pw = new PrintWriter("src/Exercicios/JavaIO/ATP39/Dados/Pessoa2.txt");
            for (int i = 1; i <=5 ; i++) {
                Scanner sc = new Scanner(System.in);
                String nomes = sc.nextLine();
                pw.println(nomes);
            }

            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel achar esse arquivo");
        }



    }
}
