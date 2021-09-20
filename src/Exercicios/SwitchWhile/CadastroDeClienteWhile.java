package Exercicios.SwitchWhile;


import java.util.Scanner;

public class CadastroDeClienteWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        boolean menu = true;


            System.out.println("---------------------Cadastro de cliente--------------------");
            System.out.println("Bem vindo!");

        while (menu) {
            System.out.println("Menu:\n0 - Sair\n1 - Cadastro de cliente\n2 - Lista de Cliente\n");
            System.out.print("Digite:");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Obrigada pela sua visita!");
                    menu = false;
                    break;

                case 1:
                    //do {
                        System.out.println("Digite o primeiro nome do cliente:");
                        String Nome = sc.nextLine();

                        while (Nome.length() < 3) {
                            System.out.println("Nome deve possuir mais de 3 letras!");
                            System.out.println("Digite o primeiro nome do cliente:");
                            Nome = sc.nextLine();

                        }

                        System.out.println("Digite o sobrenome do cliente:");
                        String Sobrenome = sc.nextLine();

                        while (Sobrenome.length() < 3) {
                            System.out.println("Sobrenome deve possuir mais de 3 letras!");
                            System.out.println("Digite o sobrenome do cliente:");
                            Sobrenome = sc.nextLine();
                        }

                        System.out.println("Digite o RG do cliente:");
                        String RG = sc.nextLine();

                        while (RG.length() < 4) {
                            System.out.println("RG deve possuir mais de 3 digitos!");
                            System.out.println("Digite o RG do cliente:");
                            RG = sc.nextLine();
                        }

                        System.out.println("Digite o Cpf do cliente:");
                        String CPF = sc.nextLine();

                        while (CPF.length() < 11) {
                            System.out.println("CPF deve possui 11 digitos!");
                            System.out.println("Digite o Cpf do cliente:");
                            CPF = sc.nextLine();
                        }

                       /* System.out.println("Deseja cadastrar outro cliente?\nS-sim\nN-Nao\n");
                        String OpcaoFinal = sc.nextLine();

                        if (OpcaoFinal == "N") {
                            continua = false;
                        }

                    }while (continua);*/

                    break;

                case 2:
                    System.out.println("\n-------------------Lista de Cliente----------------\n");
                    break;

                default:
                    System.out.println("Opcão não existe!");
                    break;
            }

        }
    }
}
