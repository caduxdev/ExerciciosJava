import java.util.Scanner;
void main() {
    //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
    Scanner sc = new Scanner(System.in);

    double n;
    double fatorial = 1;
    System.out.print("Digite o número que você quer saber o fatorial: ");
    n = sc.nextDouble();
    for (int i = 1; i <= n; i++) {
        fatorial *= i;
    }
    System.out.println(fatorial);

    sc.close();
}