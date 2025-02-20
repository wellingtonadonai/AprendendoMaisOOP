package TarefaProduto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Entrada de Produto");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();
        System.out.println("Quntidade no estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(name, preco, quantidade);


        System.out.println("produto adicionado: "+ produto);
        System.out.println();

        System.out.println();
        System.out.println("Entre com a quantidade de produto a ser colocado no estoque:");
        quantidade = sc.nextInt();
        produto.addProdutos(quantidade);

        System.out.println("produto atualizado: "+ produto);
        System.out.println();

        System.out.println();
        System.out.println("Entre com a quantidade de produto a ser retirado do estoque:");

        quantidade = sc.nextInt();
        produto.removeProdutos(quantidade);

        System.out.println("produto removido: "+ produto);
        System.out.println();


        sc.close();

    }
}
