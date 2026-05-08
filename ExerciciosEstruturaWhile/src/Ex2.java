import java.util.Scanner;
void main() {
    //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
    Scanner sc = new Scanner(System.in);

    double x, y;
    System.out.print("Digite o valor de X: ");
    x = sc.nextDouble();
    System.out.print("Digite o valor de Y: ");
    y = sc.nextDouble();
    while (x != 0 || y != 0){
        if(x > 0 && y > 0){
            System.out.println("Primeiro");
            System.out.print("Digite o valor de X: ");
            x = sc.nextDouble();
            System.out.print("Digite o valor de Y: ");
            y = sc.nextDouble();
        }
        else if (x < 0 && y > 0) {
            System.out.println("Segundo");
            System.out.print("Digite o valor de X: ");
            x = sc.nextDouble();
            System.out.print("Digite o valor de Y: ");
            y = sc.nextDouble();
        }
        else if (x < 0 && y < 0) {
            System.out.println("Terceiro");
            System.out.print("Digite o valor de X: ");
            x = sc.nextDouble();
            System.out.print("Digite o valor de Y: ");
            y = sc.nextDouble();
        }
        else if (x > 0 && y < 0) {
            System.out.println("Quarto");
            System.out.print("Digite o valor de X: ");
            x = sc.nextDouble();
            System.out.print("Digite o valor de Y: ");
            y = sc.nextDouble();
        }
        System.out.println("Fim do programa!");
        break;
    }

    sc.close();
}