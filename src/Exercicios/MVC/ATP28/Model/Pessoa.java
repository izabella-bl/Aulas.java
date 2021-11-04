package Exercicios.MVC.ATP28.Model;

public class Pessoa extends BaseId {
    private String nome;
    public Endereco enderecoResi;
    public Endereco enderecoCorm;

    public Pessoa(){
        enderecoCorm = new Endereco();
        enderecoResi = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String
    toString() {
        return "Nome: "+this.nome +"\n"+
                "Endereço Residencial:" + enderecoResi.complemento+","+enderecoResi.numero+","+enderecoResi.complemento+". Cep:"+enderecoResi.cep+"."+enderecoResi.cidade+"-"+enderecoResi.estado+"\n" +
                "Endereço Cormecial:" + enderecoCorm.complemento+","+enderecoCorm.numero+","+enderecoCorm.complemento+". Cep:"+enderecoCorm.cep+"."+enderecoCorm.cidade+"-"+enderecoCorm.estado+"\n";
    }

}
