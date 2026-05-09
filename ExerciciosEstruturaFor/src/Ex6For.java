import java.util.Scanner;
void main() {
    //Ler um número inteiro N e calcular todos os seus divisores.
    Scanner sc = new Scanner(System.in);

    int n;
    double divisores;
    System.out.print("Digite um número: ");
    n = sc.nextInt();
    System.out.printf("Divisores de %d:%n", n);
    for(int i=1; i <= n ; i++){
        if(n % i == 0 ){
            System.out.println(i);
        }
    }

    sc.close();
}