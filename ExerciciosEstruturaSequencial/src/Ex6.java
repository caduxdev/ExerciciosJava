import java.util.Scanner;

void main() {
    //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
    // Em seguida, calcule e mostre:
    // a) a área do triângulo retângulo que tem A por base e C por altura.
    // b) a área do círculo de raio C. (pi = 3.14159)
    // c) a área do trapézio que tem A e B por bases e C por altura.
    // d) a área do quadrado que tem lado B.
    // e) a área do retângulo que tem lados A e B.
    Scanner sc = new Scanner(System.in);

    float a,b,c;
    float area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;
    double pi = 3.14159;

    System.out.print("Digite o valor de A: ");
    a = sc.nextFloat();
    System.out.print("Digite o valor de B: ");
    b = sc.nextFloat();
    System.out.print("Digite o valor de C: ");
    c = sc.nextFloat();

    area_triangulo = (a * c)/2;
    area_circulo = (float) pi * (c * c);
    area_trapezio = ((a + b) * c) / 2;
    area_quadrado = b * b;
    area_retangulo = a * b;

    System.out.printf("Triângulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetângulo: %.3f", area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo );

    sc.close();
}