package Ex2FixacaoPOO.application;
import Ex2FixacaoPOO.application.Employee;
import java.util.Scanner;

public class Main {
    //Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
    void main(){
        Scanner sc = new Scanner(System.in);

        Employee e;
        e = new Employee();

        System.out.print("Name: ");
        e.name = sc.nextLine();
        System.out.print("Gross salary: ");
        e.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        e.tax = sc.nextDouble();

        System.out.println(e);

        System.out.print("Which percentage to increase salary? ");

        e.increaseSalary(sc.nextDouble());

        System.out.println("\nUpdated data: " + e.name + ", $" + e.grossSalary);

        sc.close();
    }
}
