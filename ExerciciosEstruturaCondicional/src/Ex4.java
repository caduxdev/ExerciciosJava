import java.util.Scanner;
void main() {
    //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
    Scanner sc = new Scanner(System.in);

    int hora_inicial, hora_final, tempo_final;
    System.out.print("Digite o horario inicial do jogo: ");
    hora_inicial = sc.nextInt();
    System.out.print("Digite o horario final do jogo: ");
    hora_final = sc.nextInt();

    if (hora_inicial > hora_final){
        tempo_final = 24 - (hora_inicial - hora_final);
            System.out.printf("O jogo durou %d horas!", tempo_final);
    }
    else if(hora_final > hora_inicial){
        tempo_final = hora_final - hora_inicial;
            System.out.printf("O jogo durou %d horas!", tempo_final);
        }
    else {
        System.out.println("O jogo durou 24h!");
    }
    sc.close();
}