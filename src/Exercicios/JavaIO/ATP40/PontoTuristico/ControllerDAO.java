package Exercicios.JavaIO.ATP40.PontoTuristico;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerDAO implements IController{



    public void create(PontoTuristico dado) {
        try {
            FileWriter fw = new FileWriter("src/Exercicios/JavaIO/ATP40/PontoTuristico/Local.csv", true);
            String dados = dado.nome+";"+dado.descricao+";"+dado.localizacao;
            fw.write(dados+"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<String> read() {
        ArrayList<String> dados = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File("src/Exercicios/JavaIO/ATP40/PontoTuristico/Local.csv"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                dados.add(linha);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dados;
    }
}
