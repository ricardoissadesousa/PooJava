package introducaoPoo.entities;

public class Employee {
    public String name;
    public double salary;
    public double tax;

    public double netSalary() {
        return salary - tax;
    }

    public void increaseSalary(double porcentage){
        salary += (this.salary * porcentage)/100;


    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
