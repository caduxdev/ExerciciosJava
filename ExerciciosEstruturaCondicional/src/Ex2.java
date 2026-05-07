import java.util.Scanner;

void main() {
    //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    Scanner sc = new Scanner(System.in);

    int x;
    System.out.print("Digite um numero inteiro: ");
    x = sc.nextInt();

    if (x % 2 == 0 ){
        System.out.printf("O número %d é par!", x);
    }
    else{
        System.out.printf("O número %d é impar!" , x);
    }

    sc.close();
}
