package Ex2POO.application;
import Ex2POO.application.Product;
import java.util.Scanner;

public class Main {

    void main(){
        /*Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque).
        Em seguida:
        • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
        • Realizar uma entrada no estoque e mostrar novamente os dados do produto
        • Realizar uma saída no estoque e mostrar novamente os dados do produto
         */
        Scanner sc = new Scanner(System.in);

        Product produto1;
        produto1 = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name:");
        produto1.name = sc.nextLine();
        System.out.print("Price:");
        produto1.price = sc.nextDouble();
        System.out.print("Quantity in stock:");
        produto1.quantity = sc.nextInt();

        System.out.println(produto1);

        System.out.print("\nEnter the number of products to be added in stock:");
        produto1.addProducts(sc.nextInt());

        System.out.println(produto1);

        System.out.print("\nEnter the number of products to be removed from stock:");
        produto1.removeProducts(sc.nextInt());

        System.out.println(produto1);

        sc.close();

    }
}
