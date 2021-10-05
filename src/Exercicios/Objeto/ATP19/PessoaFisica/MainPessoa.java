package Exercicios.Objeto.ATP19.PessoaFisica;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa[] pessoa = new  Pessoa[5];

        Pessoa p1 = new Pessoa();
        p1.setCodigo(9292818);
        p1.setNome("Maria");
        p1.setSobrenome("Silva");
        p1.setIdade(35);
        p1.setRg(928392);
        p1.setCpf("933.838.939-83");

        Pessoa p2= new Pessoa();
        p2.setCodigo(2938489);
        p2.setNome("João");
        p2.setSobrenome("Lima");
        p2.setIdade(24);
        p2.setRg(4945833);
        p2.setCpf("573.958.757-73");

        Pessoa p3= new Pessoa();
        p3.setCodigo(1929494);
        p3.setNome("Ana");
        p3.setSobrenome("Paula");
        p3.setIdade(17);
        p3.setRg(4948224);
        p3.setCpf("902.847.839-43");

        Pessoa p4 = new Pessoa();
        p4.setCodigo(9292818);
        p4.setNome("Luana");
        p4.setSobrenome("Oliveira");
        p4.setIdade(30);
        p4.setRg(3746223);
        p4.setCpf("073.838.828-53");

        Pessoa p5 = new Pessoa();
        p5.setCodigo(9292818);
        p5.setNome("Luciana");
        p5.setSobrenome("Pereira");
        p5.setIdade(25);
        p5.setRg(838293);
        p5.setCpf("553.848.838-92");

        pessoa[0]=p1;
        pessoa[1]=p2;
        pessoa[2]=p3;
        pessoa[3]=p4;
        pessoa[4]=p5;

        for (Pessoa p:pessoa) {
            System.out.printf("\nNome completo: %s %s" +
                    "\nIdade: %d" +
                    "\nRG: %d" +
                    "\nCPF: %s" +
                    "\nCodigo: %d" +
                    "\n",p.getNome(),p.getSobrenome(),p.getIdade(),p.getRg(),p.getCpf(),p.getCodigo());
        }

    }
}
