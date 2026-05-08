import java.util.Scanner;
void main() {
    //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
    Scanner sc = new Scanner(System.in);

    int info_cod;
    int count_gasolina = 0;
    int count_alcool = 0;
    int count_diesel = 0;
    System.out.printf("Digite o tipo de combustível: %n1.Álcool%n2.Gasolina%n3.Diesel%n4.Fim%n");
    System.out.print("Digite aqui: ");
    info_cod = sc.nextInt();
    while(info_cod != 4){
        if(info_cod == 1){
            count_alcool += 1;
            System.out.printf("%n%nDigite o tipo de combustível: %n1.Álcool%n2.Gasolina%n3.Diesel%n4.Fim%n");
            System.out.print("Digite aqui: ");
            info_cod = sc.nextInt();
        }
        else if(info_cod == 2){
            count_gasolina += 1;
            System.out.printf("%n%nDigite o tipo de combustível: %n1.Álcool%n2.Gasolina%n3.Diesel%n4.Fim%n");
            System.out.print("Digite aqui: ");
            info_cod = sc.nextInt();
        }
        else if(info_cod == 3){
            count_diesel += 1;
            System.out.printf("%n%nDigite o tipo de combustível: %n1.Álcool%n2.Gasolina%n3.Diesel%n4.Fim%n");
            System.out.print("Digite aqui: ");
            info_cod = sc.nextInt();
        }
    }
    System.out.printf("%n%nMUITO OBRIGADO!%nÁlcool:%d%nGasolina:%d%nDiesel:%d", count_alcool, count_gasolina, count_diesel);

    sc.close();
}