package Exercicios.Objeto.ATP31.View;

public class View {
    public static void main(String[] args) {
        MenuView menu = new MenuView();
        int op;
        do {
            menu.Menu();
            op = menu.opcao();
            menu.cases(op);
        }while (op != 5);
    }
}
