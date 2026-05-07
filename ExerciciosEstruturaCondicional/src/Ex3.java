import java.util.Scanner;

void main() {
  //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
  Scanner sc = new Scanner(System.in);

  int a, b;
  System.out.print("Digite um valor inteiro A: ");
  a = sc.nextInt();
  System.out.print("Digite um valor inteiro B: ");
  b = sc.nextInt();

  if (a > b){
    if (a % b == 0) {
      System.out.println("São multiplos!");
    }
    else{
      System.out.println("Não são multiplos!");
    }
  }
  else if (b % a == 0) {
    System.out.println("São multiplos!");
  }
  else{
    System.out.println("Não são multiplos!");
  }

  sc.close();
}