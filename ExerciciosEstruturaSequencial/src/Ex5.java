import java.util.Scanner;

void main() {
    //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
    Scanner sc = new Scanner(System.in);

    int cod_peca1, cod_peca2, numero_peca1, numero_peca2;
    double preco_unitario_peca1, preco_unitario_peca2, valor_peca1, valor_peca2, valor_final;

    System.out.print("Digite o código da peça 1: ");
    cod_peca1 = sc.nextInt();
    System.out.print("Digite o número de peças 1: ");
    numero_peca1 = sc.nextInt();
    System.out.print("Digite o valor unitário da peça 1: ");
    preco_unitario_peca1 = sc.nextDouble();
    System.out.print("Digite o código da peça 2: ");
    cod_peca2 = sc.nextInt();
    System.out.print("Digite o número de peças 2: ");
    numero_peca2 = sc.nextInt();
    System.out.print("Digite o valor unitário da peça 2: ");
    preco_unitario_peca2 = sc.nextDouble();

    valor_peca1 = numero_peca1 * preco_unitario_peca1;
    valor_peca2 = numero_peca2 * preco_unitario_peca2;
    valor_final = valor_peca1 + valor_peca2;

    System.out.printf("%nValor a pagar: R$%.2f", valor_final );

    sc.close();
}