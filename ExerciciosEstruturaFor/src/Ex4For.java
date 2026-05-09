import java.util.Scanner;
void main() {
    //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
    Scanner sc = new Scanner(System.in);

    int n;
    double n1, n2, divisao;
    System.out.print("Digite o número de pares que você quer dividir: ");
    n = sc.nextInt();
    System.out.println();
    for(int i=0 ; i < n; i++){
        System.out.print("N1: ");
        n1 = sc.nextDouble();
        System.out.print("N2: ");
        n2 = sc.nextDouble();
        if(n2 == 0){
            System.out.println("Divisão impossível!");
            System.out.println();
        }
        else{
            divisao = n1/n2;
            System.out.printf("Divisão de %.2f por %.2f será %.2f!", n1, n2, divisao);
            System.out.println();
            System.out.println();
        }
    }
    sc.close();
}