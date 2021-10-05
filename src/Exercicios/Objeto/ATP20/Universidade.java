package Exercicios.Objeto.ATP20;

import java.math.BigDecimal;

public class Universidade {
    public static void main(String[] args) {

        Funcionario fun = new Funcionario();
        fun.setNome("Maria");
        fun.setSobrenome("Silva");
        fun.setDepartamento("Corpo docente");
        fun.setSalario(BigDecimal.valueOf(3500.00));
        fun.setMatricula(726535264);
        String FunNome = fun.getNome();
        String FunSobrenome = fun.getSobrenome();
        String FunDepartamento = fun.getDepartamento();
        BigDecimal FunSalario = fun.getSalario();
        int FunMatricula = fun.getMatricula();


        Coordenador co = new Coordenador();
        co.setNome("Roberto");
        co.setSobrenome("Lima");
        co.setDepartamento("Coordenadação");
        co.setCurso("TI");
        co.setBonus(928);
        co.setMatricula(635253718);
        co.setSalario(BigDecimal.valueOf(5400.00));
        String CoNome = co.getNome();
        String CoSobrenome = co.getSobrenome();
        String CoDepartamento = co.getDepartamento();
        String CoCurso = co.getCurso();
        Long CoBonus = co.getBonus();
        int CoMatricula = co.getMatricula();
        BigDecimal CoSalario = co.getSalario();

        Aluno al = new Aluno();
        al.setNome("Aline");
        al.setSobrenome("Lopes");
        al.setTurma("turma D");
        al.setMatricula(378262532);
        al.setCurso("Ciência da informação");
        String AlNome = al.getNome();
        String AlSobrenome = al.getSobrenome();
        String AlTurma = al.getTurma();
        int AlMatricula = al.getMatricula();
        String AlCurso = al.getCurso();

        System.out.printf("\nNome Completo: %s %s" +
                "\nDepartamento: %s "+
                "\nMatricula: %d" +
                "\nSalario: R$ %.2f\n",FunNome,FunSobrenome,FunDepartamento,FunMatricula,FunSalario);

        System.out.printf("\nNome Completo: %s %s" +
                "\nDepartamento: %s "+
                 "\nBonus : %d "+
                "\nMatricula: %d" +
                "\nSalario: R$ %.2f\n",CoNome,CoSobrenome,CoDepartamento,CoBonus,CoMatricula,CoSalario);

        System.out.printf("\nNome Completo: %s %s" +
                "\nTurma: %s "+
                "\nMatricula: %d" +
                "\nCurso: %s",AlNome,AlSobrenome,AlTurma,AlMatricula,AlCurso);






    }
}
