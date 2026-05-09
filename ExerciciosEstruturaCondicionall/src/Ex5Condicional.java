import java.util.Scanner;
void main() {
    //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
    //1 - Cachorro Quente - R$4.00
    //2 - X-Salada - R$4.50
    //3 - X-Bacon - R$5.00
    //4 - Torrada Simples - R$2.00
    //5 - Refrigerante - R$1.50

    Scanner sc = new Scanner(System.in);
    int cod_item, qtd_item;
    double preco_hotdog, preco_xsalada, preco_xbacon, preco_torrada, preco_refri, valor_final;

    preco_hotdog = 4.00;
    preco_xsalada = 4.50;
    preco_xbacon = 5.00;
    preco_torrada = 2.00;
    preco_refri = 1.50;

    System.out.print("Digite o código do produto: ");
    cod_item = sc.nextInt();
    System.out.print("Digite a quantidade desejada: ");
    qtd_item = sc.nextInt();

    if (cod_item == 1){
        valor_final = preco_hotdog * qtd_item;
        if(qtd_item == 1){
            System.out.println("O valor final a pagar por 1 HotDog é de R$4.00");
        }
        else {
            System.out.printf("O valor final a pagar por %d HotDog é de R$%.2f", qtd_item, valor_final);
        }
    }
    else if (cod_item == 2){
        valor_final = preco_xsalada * qtd_item;
        if(qtd_item == 1){
            System.out.println("O valor final a pagar por 1 X-Salada é de R$4.50");
        }
        else {
            System.out.printf("O valor final a pagar por %d X-Salada é de R$%.2f", qtd_item, valor_final);
        }
    }
    else if (cod_item == 3){
        valor_final = preco_xbacon * qtd_item;
        if(qtd_item == 1){
            System.out.println("O valor final a pagar por 1 X-Bacon é de R$5.00");
        }
        else {
            System.out.printf("O valor final a pagar por %d X-Bacon é de R$%.2f", qtd_item, valor_final);
        }
    }
    else if (cod_item == 4){
        valor_final = preco_torrada * qtd_item;
        if(qtd_item == 1){
            System.out.println("O valor final a pagar por 1 Torrada é de R$2.00");
        }
        else {
            System.out.printf("O valor final a pagar por %d Torrada é de R$%.2f", qtd_item, valor_final);
        }
    }
    else if (cod_item == 5){
        valor_final = preco_refri * qtd_item;
        if(qtd_item == 1){
            System.out.println("O valor final a pagar por 1 Refrigerante é de R$1.50");
        }
        else {
            System.out.printf("O valor final a pagar por %d Refrigerante é de R$%.2f", qtd_item, valor_final);
        }
    }
    else{
        System.out.println("Você não digitou nenhum código registrado!");
    }






}