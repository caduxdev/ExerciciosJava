package Ex1FixacaoPOO.application;
import java.util.Scanner;
import Ex1FixacaoPOO.application.Rectangle;


public class Main {
    //Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor da sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
    void main(){

        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        r.height = sc.nextDouble();
        r.widht = sc.nextDouble();

        System.out.printf("Area = %.2f%n", r.area());

        System.out.printf("Perimeter = %.2f%n", r.perimeter());

        System.out.printf("Diagonal = %.2f%n", r.diagonal());



        sc.close();

    }
}
