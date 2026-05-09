import java.util.Scanner;
void main() {
    //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
    Scanner sc = new Scanner(System.in);

    int n, number;
    int number_in = 0;
    int number_out = 0;
    System.out.print("Pressione quantos números você vai digitar: ");
    n = sc.nextInt();
    for(int i=0; i < n; i++){
        System.out.print("Digite um número: ");
        number = sc.nextInt();
        if (number >= 10 && number <= 20){
            number_in += 1;
        }
        else{
            number_out += 1;
        }
    }
    System.out.printf("%d in%n%d out", number_in, number_out);


    sc.close();
}