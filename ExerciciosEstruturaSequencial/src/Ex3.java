import java.util.Scanner;
void main() {
    //Fazer um programa para ler quatro valores inteiros A, B, C e D.
    // A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    Scanner sc = new Scanner(System.in);

    int a , b , c , d , produto1 , produto2, diferenca ;
    System.out.print("Digite o valor A: ");
    a = sc.nextInt();
    System.out.print("Digite o valor B: ");
    b = sc.nextInt();
    System.out.print("Digite o valor C: ");
    c = sc.nextInt();
    System.out.print("Digite o valor D: ");
    d = sc.nextInt();
    produto1 = a * b;
    produto2 = c * d;
    diferenca = produto1 - produto2;
    System.out.printf("Diferenca entre o produto de AxB e de CxB: %d", diferenca);

    sc.close();
}