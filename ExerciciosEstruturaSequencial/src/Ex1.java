import java.util.Scanner;

void main() {
    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa, conforme exemplos.
    Scanner sc = new Scanner(System.in);

    int x, y, soma;

    System.out.print("First number: ");
    x = sc.nextInt();
    System.out.print("Second number: ");
    y = sc.nextInt();
    soma = x + y;

    System.out.printf("Soma: %d", soma);

    sc.close();
}
