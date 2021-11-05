package Exercicios.JavaIO.ATP40.Empresa;


import java.io.*;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        emp.cnpj = "9282727/0001-383";
        emp.nome = "Creme Mel";
        emp.ramo = "Alimenticio";


        try {
            FileWriter fw = new FileWriter("src/Exercicios/JavaIO/ATP40/Empresa/Dados.csv",true);
            fw.write(emp.cnpj+";"+emp.nome+";"+emp.ramo+"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Scanner sc = new Scanner(new File("src/Exercicios/JavaIO/ATP40/Empresa/Dados.csv"));
            while (sc.hasNextLine()){
                String linha = sc.nextLine();
                String[] empresaString = linha.split(";");
                Empresa em = new Empresa();
                em.cnpj = empresaString[0];
                em.nome = empresaString[1];
                em.ramo = empresaString[2];

                System.out.printf(em.cnpj+";"+em.nome+";"+em.ramo+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
