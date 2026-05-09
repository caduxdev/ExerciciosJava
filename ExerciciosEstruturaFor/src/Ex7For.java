import java.util.Scanner;
void main() {
    //Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("Digite o número de linhas que você quer: ");
    n = sc.nextInt();
    for(int i=1; i<=n; i++){
        System.out.print(i+" ");
        System.out.print(i*i+" ");
        System.out.print(i*i*i);
        System.out.println();
    }

    sc.close();
}