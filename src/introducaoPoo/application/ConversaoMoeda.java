package introducaoPoo.application;

import introducaoPoo.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price: ");
        double price = sc.nextDouble();

        System.out.println("How many dollars will be bougth?: ");
        int dollars = sc.nextInt();



        System.out.println("Amout to be paid in rais = ");

        System.out.println(CurrencyConverter.calculate(price, dollars));


    }
}
