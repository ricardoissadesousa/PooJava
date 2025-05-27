package introducaoPoo.application;

import introducaoPoo.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("digite seu Nome: ");
        employee.name = sc.nextLine();

        System.out.println("Digite o salario bruto: ");
        employee.salary = sc.nextDouble();

        System.out.println("Valor da Taxa: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: "+employee.name+", $ "+ employee.netSalary());

        System.out.println("Whit percentue to increase salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);


        System.out.println("Updated Salary: "+ employee);




    }
}
