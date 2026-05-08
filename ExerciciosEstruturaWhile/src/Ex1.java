import java.util.Scanner;
void main() {
    //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

    Scanner sc = new Scanner(System.in);

    int senha;
    System.out.print("Digite a senha: ");
    senha = sc.nextInt();
    while(senha != 2004){
        System.out.println("Acesso negado!");
        System.out.print("Digite a senha correta: ");
        senha = sc.nextInt();
    }

    System.out.println("Acesso permitido!");

    sc.close();
}
