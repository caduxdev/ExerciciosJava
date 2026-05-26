package Ex3FixacaoPOO.application;
import java.util.Scanner;

public class Main {
    /*
    Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
     */
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");

        double dollar_price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount, dollar_price);

        System.out.printf("Amount to be paid in reais = %.2f", result);

        sc.close();
    }



}
