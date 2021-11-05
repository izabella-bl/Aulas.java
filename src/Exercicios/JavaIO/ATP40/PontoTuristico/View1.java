package Exercicios.JavaIO.ATP40.PontoTuristico;

public class View1 {
    public static void main(String[] args) {
        PontoTuristico pt = new PontoTuristico();
        ControllerDAO cdao = new ControllerDAO();

        pt.nome = "Goiás Velho";
        pt.descricao = "Local historico";
        pt.localizacao = "Goiás";

        cdao.create(pt);

        for ( String locais: cdao.read()) {
            System.out.println(locais);
        }

    }
}
