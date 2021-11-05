package Exercicios.JavaIO.P1.Controller;


import Exercicios.JavaIO.P1.Model.Pessoa;
import Exercicios.JavaIO.P1.dao.PessoaDao;

public class PessoaController extends BaseController<Pessoa>{
    public PessoaController() {
        super(new PessoaDao());
    }
}
