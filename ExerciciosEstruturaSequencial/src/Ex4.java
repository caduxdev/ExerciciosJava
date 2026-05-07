import java.util.Scanner;

void main() {
    //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
    Scanner sc = new Scanner(System.in);

    int numero_funcionario;
    double horas_trabalhadas, salario_hora, salario_funcionario;
    System.out.print("Digite o numero do funcionario: ");
    numero_funcionario = sc.nextInt();
    System.out.print("Digite as horas trabalhadas: ");
    horas_trabalhadas = sc.nextDouble();
    System.out.print("Digite o salario por hora: ");
    salario_hora = sc.nextDouble();
    salario_funcionario = horas_trabalhadas * salario_hora;
    System.out.printf("%nNUMBER: %d%n", numero_funcionario);
    System.out.printf("SALARY U$%.2f", salario_funcionario);

    sc.close();
}

