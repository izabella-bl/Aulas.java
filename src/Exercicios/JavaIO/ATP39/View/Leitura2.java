package Exercicios.JavaIO.ATP39.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/Exercicios/JavaIO/ATP39/Dados/Pessoa2.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arqurivo nao encontrado");
        }
    }
}
