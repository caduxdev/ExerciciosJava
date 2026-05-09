import java.util.Scanner;

void main() {
    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    Scanner sc = new Scanner(System.in);

    int x;
    System.out.print("Digite um numero inteiro: ");
    x = sc.nextInt();

    if (x > 0 ){
        System.out.printf("O número %d é positivo!", x);
    }
    else{
        System.out.printf("O número %d é negativo!" , x);
    }

    sc.close();
}
