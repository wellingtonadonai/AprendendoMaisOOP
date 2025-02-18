package TarefaProduto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Entrada de Produto");
        System.out.println("Nome: ");
        produto.name = sc.nextLine();
        System.out.println("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.println("Quntidade no estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println("produto adicionado: "+ produto);
        System.out.println();

        System.out.println();
        System.out.println("Entre com a quantidade de produto a ser colocado no estoque:");
        int quatidade = sc.nextInt();
        produto.addProdutos(quatidade);

        System.out.println("produto atualizado: "+ produto);
        System.out.println();

        System.out.println();
        System.out.println("Entre com a quantidade de produto a ser retirado do estoque:");

        int quantidade = sc.nextInt();
        produto.removeProdutos(quantidade);

        System.out.println("produto removido: "+ produto);
        System.out.println();


        sc.close();

    }
}
