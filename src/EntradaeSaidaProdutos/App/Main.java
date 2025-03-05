package EntradaeSaidaProdutos.App;

import EntradaeSaidaProdutos.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();



        System.out.println("Entrada de Produto");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();


        Produto produto = new Produto(name, preco);


        System.out.println("produto adicionado: "+ produto);
        System.out.println();

        System.out.println();
        System.out.println("Entre com a quantidade de produto a ser colocado no estoque:");
        int quantidade = sc.nextInt();
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
