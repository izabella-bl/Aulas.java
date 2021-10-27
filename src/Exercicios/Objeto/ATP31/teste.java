package Exercicios.Objeto.ATP31;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        boolean valido = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();

            if (!matchesOnlyText(nome)) {
                System.out.println("Não é permitido número");
                valido = false;
            }
          else {
              valido=true;
          }
        }while (!valido);
    }

    private static boolean matchesOnlyText(String text) {
        return text.matches("[^\\d]+");
    }

}
