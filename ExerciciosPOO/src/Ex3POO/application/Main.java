package Ex3POO.application;
import Ex3POO.application.Student;
import java.util.Scanner;

public class Main {
    void main(){
        Scanner sc = new Scanner(System.in);

        Student s;
        s = new Student();

        System.out.print("Name: ");
        s.name = sc.nextLine();
        System.out.println("Enter the student 3 grades: ");
        s.n1 = sc.nextDouble();
        s.n2 = sc.nextDouble();
        s.n3 = sc.nextDouble();
        s.passOrNot(s.n1, s.n2, s.n3);
        sc.close();
    }
}
