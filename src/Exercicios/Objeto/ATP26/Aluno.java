package Exercicios.Objeto.ATP26;

import java.util.Objects;

public class Aluno extends Pessoa{
    public int matricula;
    public String curso;
    public String turma;

    @Override
    public boolean equals(Object obj) {
      Aluno aluno = (Aluno) obj;

      if (this.nome.equals(aluno.nome)){
          return true;
      }
      return  false;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("\nMatricula: %d\nCurso: %s\nTurma: %s",this.matricula,this.curso,this.turma);
    }
}
