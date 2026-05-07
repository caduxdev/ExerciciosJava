import java.util.Scanner;
void main() {
    //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
    // Fórmula da área: area = π . raio2
    // Considere o valor de π = 3.14159
    Scanner sc = new Scanner(System.in);

    double raio, area;
    double pi = 3.14159;

    System.out.print("Digite o raio do circulo: ");
    raio = sc.nextDouble();

    area = pi * (raio * raio);

    System.out.printf("O valor da area do circulo sera: %.4f", area);

    sc.close();
}