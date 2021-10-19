package Exercicios.Objeto.ATP26;

public class Dados {

    int posicaoAtual = 0;
    int tamanhoAtual = 5;
    private Object[] lista;

    public int size(){

        return posicaoAtual ;
    }

    public Dados() {
        this.lista = new Object[tamanhoAtual];
    }

    public String adicionar(Object obj) {
        String mensagem;

        if (posicaoAtual < lista.length) {

            lista[posicaoAtual] = obj;
            posicaoAtual ++;


        } else {
            tamanhoAtual = tamanhoAtual + 5;  //Aumenta o tamanho do array atual
            Object[] lista2 = new Object[tamanhoAtual];

            for (int i = 0; i < lista.length; i++) {
                lista2[i] = lista[i];
            }
            lista = lista2;     //Lista recebe os dados de lista2
            lista[posicaoAtual] = obj;
            posicaoAtual ++;
        }
            mensagem = "Salvo com sucesso";
            return mensagem;
    }

    public boolean contains(Object obj){
        for (int i = 0; i < posicaoAtual; i++) {
            if(lista[i].equals(obj)){
                return true;
            }
        }
        return false;
    }


    public String remove(Object obj){
        for (int i = 0; i < lista.length; i++) {
            if( lista[i].equals(obj)){
                reorganiza(i);
                posicaoAtual --;
                return "removido com sucesso";
            }
        }
        return "Não encontrado";
    }

    public void reorganiza(int posicao){

        for (int i = posicao; i < lista.length-1; i++) { // (lista.length-1) porque posição 0 vai para 1 , ai tem que iniciar -1 para ir para 0.
            this.lista[i] = this.lista[i+1];          //Organiza os dados para ser removido, jogando os dados anterior para poisção a frente
        }
    }

    public void retorno(){
        for (int i = 0; i < lista.length; i++) {;

            if (lista[i] != null) {
                System.out.println(lista[i]);
            }

        }
    }
}
