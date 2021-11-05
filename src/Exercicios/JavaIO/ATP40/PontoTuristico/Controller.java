package Exercicios.JavaIO.ATP40.PontoTuristico;

import java.util.ArrayList;

public class Controller implements IController {
    private ArrayList<PontoTuristico> pt;

    public Controller(){
        this.pt = new ArrayList<PontoTuristico>();
    }

    public void create(PontoTuristico dado) {
        pt.add(dado);
    }


    public ArrayList<String> read() {
        ArrayList<String> retorno = new ArrayList <String>();

        for (PontoTuristico p: this.pt) {
            retorno.add(p.toString());
        }
        return retorno;
    }


}
