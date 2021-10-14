package Exercicios.Objeto.ATP23.View;

import Exercicios.Objeto.ATP23.Controller.LivroController;
import Exercicios.Objeto.ATP23.Model.Livro;

public class MainView {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        LivroController livro = new LivroController();
        l1.setTitulo("Herry Potter e a pedra filosofal");
        l1.setGenero("Fantansia");
        l1.setDescricao("Sobre um garoto,...");
        l1.setAnoDeLancamento(2001);
        livro.create(l1);

        Livro l2 = new Livro();
        l2.setTitulo("Exorcismo");
        l2.setGenero("terror");
        l2.setDescricao("Sobre uma garota possuida,...");
        l2.setAnoDeLancamento(2016);
        livro.create(l2);

        Livro l3 = new Livro();
        l3.setTitulo("O Principe Cruel");
        l3.setGenero("Romance");
        l3.setDescricao("Sobre uma garota ,...");
        l3.setAnoDeLancamento(2018);
        livro.create(l3);

        for (Livro liv: livro.read()) {
            System.out.println(liv);
        }

        
        
    }
}
