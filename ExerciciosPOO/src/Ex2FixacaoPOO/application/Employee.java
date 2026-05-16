package Ex2FixacaoPOO.application;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary = (grossSalary - tax) + (grossSalary * percentage / 100);
    }

    public String toString(){
        return "\nEmployee: " + name + ", $" + String.format("%.2f", netSalary());
    }
}
