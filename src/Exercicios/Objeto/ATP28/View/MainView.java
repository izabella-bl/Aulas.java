package Exercicios.Objeto.ATP28.View;

import Exercicios.Objeto.ATP28.Controller.PessoaFisicaController;
import Exercicios.Objeto.ATP28.Controller.PessoaJuridicaController;
import Exercicios.Objeto.ATP28.Model.PessoaFisica;
import Exercicios.Objeto.ATP28.Model.PessoaJuridica;

public class MainView {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        PessoaFisicaController pfc = new PessoaFisicaController();
        PessoaJuridicaController pjc = new PessoaJuridicaController();


        pf.setNome("Izabella");
        pf.setCpf("111.111.111-32");
        pf.enderecoResi.logradouro ="Rua 24 de Outubro";
        pf.enderecoResi.numero = 553;
        pf.enderecoResi.complemento = "Lot 23";
        pf.enderecoResi.cep = "84293-32";
        pf.enderecoResi.cidade = "Goiânia";
        pf.enderecoResi.estado = "Goiás";


        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Izabella");
        pj.setCnpj("111.111.111-32");
        pj.enderecoCorm.logradouro ="Rua 24 de Outubro";
        pj.enderecoCorm.numero = 553;
        pj.enderecoCorm.complemento = "Lot 23";
        pj.enderecoCorm.cep = "84293-32";
        pj.enderecoCorm.cidade = "Goiânia";
        pj.enderecoCorm.estado = "Goiás";

        pfc.create(pf);
        pjc.create(pj);

        System.out.println("==========================================Pessoa Física====================================");
        for ( PessoaFisica l: pfc.read()) {
            System.out.println(l);
        }

        System.out.println("==========================================Pessoa Jurídica====================================");
        for ( PessoaJuridica l1: pjc.read()) {
            System.out.println(l1);
        }




    }
}
