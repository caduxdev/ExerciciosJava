package Ex3POO.application;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public void passOrNot(double n1, double n2, double n3){
        double result = n1 + n2 + n3;
        if (result > 60){
            System.out.println("PASS");
        }
        else{
            double missing = 60 - result;
            System.out.println("FAILED");
            System.out.printf("MISSING: %.2f POINTS", missing);
        }
    }
}
