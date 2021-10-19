package Exercicios.Objeto.ATP26;

public class Pessoa {
    public String nome;
    public String sobreNome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa) obj;

        if (this.nome.equals(pessoa.nome) && this.sobreNome.equals(pessoa.sobreNome)){
           return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("\nNome Completo: %s %s\nIdade: %d",this.nome,this.sobreNome,this.idade);
    }
}
