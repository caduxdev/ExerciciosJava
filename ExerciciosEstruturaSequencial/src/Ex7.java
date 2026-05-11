import java.util.Scanner;
void main() {
    /*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área. A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte (fórmula de Heron):

    area = (p * (p-a) * (p-b) * (p-c))/p
    p = (a + b + c) / 2
    */

    Scanner sc = new Scanner(System.in);

    double a1,b1,c1;
    System.out.println("Enter the measurements of Triangle X:");
    a1 = sc.nextDouble();
    b1 = sc.nextDouble();
    c1 = sc.nextDouble();
    double p1 = (a1 + b1 + c1) / 2;
    double area1 = Math.sqrt(p1 * (p1-a1) * (p1-b1) * (p1-c1));

    double a2,b2,c2;
    System.out.println("Enter the measurements of Triangle Y:");
    a2 = sc.nextDouble();
    b2 = sc.nextDouble();
    c2 = sc.nextDouble();
    double p2 = (a2 + b2 + c2) / 2;
    double area2 = Math.sqrt(p2 * (p2-a2) * (p2-b2) * (p2-c2));

    System.out.printf("\nTriangle X area: %.4f", area1);
    System.out.printf("\nTriangle Y area: %.4f", area2);
    largerTriangle(area1,area2);
    sc.close();
}

public static void largerTriangle(double x, double y){
    if (x > y){
        System.out.println("\nLarger: X" );
    }
    else if (y > x){
        System.out.println("\nLarger: Y");
    }
    else{
        System.out.println("\nThey are the same!");
    }
}
