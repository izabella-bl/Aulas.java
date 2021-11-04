package Exercicios.MVC.ATP28.Model;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return String.format("\nID: %d\n" +
                     "CNPJ: %s\n"+
                     super.toString()+"\n", this.getId(), this.cnpj);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PessoaJuridica) {
            PessoaJuridica pessoaJuridica = (PessoaJuridica) obj;
            if (this.getId() == pessoaJuridica.getId()) {
                return true;
            }
        }
        return false;
    }
}
