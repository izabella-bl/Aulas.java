package Exercicios.MVC.ATP31.View;


import java.util.Scanner;

public class MenuView {
    static Scanner sc = new Scanner(System.in);
    static CasesView cv = new CasesView();

    public void Menu() {
        System.out.println("=========================Menu===========================");
        System.out.println("1 - Cadastrar\n" +
                "2 - Lista\n" +
                "3 - Atulizar\n" +
                "4 - Remover\n");
    }

    public int opcao() {
        int op = 0;
        boolean valida = true;

        do {
            try {
                System.out.print("Digite uma opção: ");
                op = Integer.parseInt(sc.nextLine());
                valida = true;
            } catch (Exception e) {
                System.out.println("Opção invalida!Tente novamente");
                valida = false;
            }
        } while (!valida);
        return op;
    }


    public void cases(int op) {
        switch (op) {
            case 1:
                cv.case1();
                break;
            case 2:
                cv.case2();
                break;
            case 3:
                cv.case3();
                break;
            case 4:
                cv.case4();
                break;
            case 5:
                System.out.println("Até mais!");
                break;
            default:
                System.out.println("Opção invalida tente novamente!");
                break;
        }
    }
}