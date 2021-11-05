package Exercicios.JavaIO.ATP40.PontoTuristico;

public class View2 {
    public static void main(String[] args) {
        PontoTuristico pt = new PontoTuristico();
        PontoTuristico pt2 = new PontoTuristico();
        Controller ptc = new Controller();

        pt.nome = "Goiás Velho";
        pt.descricao = "Local historico";
        pt.localizacao = "Goiás";

        pt2.nome = "Canún";
        pt2.descricao = "Prais lindas";
        pt2.localizacao = "Mexico";


        ptc.create(pt);
        ptc.create(pt2);

        for (String pontoTur: ptc.read()) {
            System.out.println(pontoTur);
        }
    }
}
