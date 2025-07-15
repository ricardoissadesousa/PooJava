package introducaoPoo.application;

import introducaoPoo.entities.Department;
import introducaoPoo.entities.Enum.WorkerLevel;
import introducaoPoo.entities.HourContract;
import introducaoPoo.entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainComp1 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter derpartment ' s name: ");
        String derpartamentName = sc.nextLine();
        System.out.println("Enter Worker Data: ");
        System.out.print("name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary,new Department(derpartamentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Enter contract #"+ i +" data: ");
            System.out.print("Date (DD/MM/YYYY): )");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration(hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);

        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartment().getName());
        System.out.println("income For: "+ monthAndYear+": "+ String.format("%.2f", worker.income(year,month)));



        sc.close();
    }

}
