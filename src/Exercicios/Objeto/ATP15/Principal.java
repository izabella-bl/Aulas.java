package Exercicios.Objeto.ATP15;



public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Izabella";
        pessoa.Sobrenome = "Barros";
        pessoa.idade = 21;

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Maria";
        pessoa1.Sobrenome = "Silva";
        pessoa1.idade = 32;

        imprimir(pessoa);
        imprimir(pessoa1);


    }

    static void imprimir(Pessoa p){
        System.out.println("---------------Pessoa -------------");
        System.out.println("Nome: "+p.nome);
        System.out.println("Sobrenome: "+p.Sobrenome);
        System.out.println("idade: "+p.idade);

    }
}
