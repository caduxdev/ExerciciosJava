import java.util.Scanner;
void main() {
    //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5
    Scanner sc = new Scanner(System.in);

    int qtd_casos;
    double n1, n2, n3, media_final;
    System.out.print("Digite quantos casos de teste você vai digitar: ");
    qtd_casos = sc.nextInt();
    for( int i=0 ; i < qtd_casos ; i++ ){
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n1 = n1 * 2;
        n2 = n2 * 3;
        n3 = n3 * 5;
        media_final = (n1+n2+n3)/10;
        System.out.printf("%.1f", media_final);
    }
    sc.close();
}