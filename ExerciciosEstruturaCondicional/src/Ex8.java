import java.util.Scanner;

void main() {
    //Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio.
    //
    // A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
    //
    // Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
    //
    // Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
    //
    // No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

    Scanner sc = new Scanner(System.in);

    double salario, imposto1, imposto2, imposto3;
    System.out.print("Digite seu salário: ");
    salario = sc.nextDouble();

    if (salario > 2000.00 && salario <= 3000.00 ){
        imposto1 = (salario - 2000) * 0.08;
        System.out.printf("Valor de imposto a pagar: %.2f", imposto1);
    }
    else if(salario > 3000.00 && salario <= 4500.00 ){
        imposto1 = 1000.00 * 0.08;
        imposto2 = imposto1 + ((salario - 3000) * 0.18);
        System.out.printf("Valor de imposto a pagar: %.2f", imposto2);
    } else if (salario > 4500.00) {
        imposto1 = 1000.00 * 0.08;
        imposto2 = imposto1 + 1500 * 0.18;
        imposto3 = imposto2 + ((salario - 4500) * 0.28);
        System.out.printf("Valor de imposto a pagar: %.2f", imposto3);
    } else{
        System.out.println("Isento");
    }

    sc.close();
}