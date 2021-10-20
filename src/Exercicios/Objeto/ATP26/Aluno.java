package Exercicios.Objeto.ATP26;


public class Aluno extends Pessoa{
    public int matricula;
    public String curso;
    public String turma;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Aluno){
            Aluno aluno = (Aluno) obj;
            if (this.nome.equals(aluno.nome) && this.sobreNome.equals(aluno.sobreNome)){
                return true;
            }
        }
      return  false;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("\nMatricula: %d\nCurso: %s\nTurma: %s",this.matricula,this.curso,this.turma);
    }
}
