package TarefaProduto;

public class Produto {

    public String name;
    public double preco;
    public int quantidade;

    public Produto(String name, double preco, int quantidade){
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;

    }


    public double totalValorEstoque(){
        return preco * quantidade;
    }

    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }
    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return name
        +", $ "
        + String.format("%.2f", preco)
        +", "
        + quantidade
        + " unidades, total: $ "
        + String.format("%.2f",totalValorEstoque());
    }
}
