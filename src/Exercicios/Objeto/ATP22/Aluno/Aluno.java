package Exercicios.Objeto.ATP22.Aluno;

public class Aluno {
    private  String nomeCompleto;
    private  int idade;
    private  int matricula;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
         String mensagem = "Aluno: "+this.nomeCompleto+"\n"
                           +"Idade :"+this.idade+"\n"
                           +"Matrícula: "+this.matricula;
         return mensagem;
    }
}
