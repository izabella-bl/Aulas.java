package Exercicios.Objeto.ATP26;

public class Main {
    public static void main(String[] args) {
     Dados dados = new Dados();
     Pessoa p = new Pessoa();
     Aluno a = new Aluno();
     Pessoa repetida = new Pessoa();

     p.nome = "Izabella";
     p.sobreNome = "Barros";
     p.idade = 21;

     a.nome = "lucia";
     a.sobreNome = "Carvalho";
     a.idade = 18;
     a.matricula = 2828282;
     a.turma = "1° periodo";
     a.curso = "Eng. de software";

     repetida.nome = "Izabella";
     repetida.sobreNome = "Barros";
     repetida.idade = 21;

     Pessoa a2 = new Pessoa();
     a2.nome = "Izabella";
     a2.sobreNome = "Barros";
     a2.idade = 21;

     Pessoa a3 = new Pessoa();
     a3.nome = "Izabella";
     a3.sobreNome = "Barros";
     a3.idade = 21;

     Pessoa a4 = new Pessoa();
     a4.nome = "Izabella";
     a4.sobreNome = "Barros";
     a4.idade = 21;

     dados.adicionar(p);
     dados.adicionar(a);
     dados.adicionar(repetida);
     dados.adicionar(a2);
     dados.adicionar(a3);
     dados.adicionar(a4);

     if(dados.contains(p) == true){
         System.out.println("Contém na lista!");
     }
     else {
         System.out.println("Não contém na lista");
     }

     System.out.println("Possui :"+dados.size());

     System.out.println(dados.remove(repetida));

     System.out.println("Possui :"+dados.size());

     dados.retorno();
    }
}
