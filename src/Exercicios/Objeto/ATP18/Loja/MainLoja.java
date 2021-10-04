package Exercicios.Objeto.ATP18.Loja;

public class MainLoja {
    public static void main(String[] args) {
        Produto p = new Produto();

       p.setCodigo(847309);
       int codigo = p.getCodigo();
       p.setNome("TV");
       String nome = p.getNome();
       p.setDescricao("60 pol");
       String descricao = p.getDescricao();
       p.setValor(6533.90);
       double valor = p.getValor();

        System.out.println("===============Produto===========");
        System.out.printf("\nCodigo: %d\nProduto: %s\nDescrição: %s\nValor: R$ %.2f\n",codigo,nome,descricao,valor);



    }
}
