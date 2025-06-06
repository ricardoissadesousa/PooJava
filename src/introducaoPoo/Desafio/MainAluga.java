package introducaoPoo.Desafio;

import introducaoPoo.entities.Aluguel;

import java.util.Scanner;

public class MainAluga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluguel[] vet = new Aluguel[10];
        System.out.println("How many rooms will be rented ?  ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i +":");
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Numero do quarto: ");
            int quarto = sc.nextInt();

            Aluguel aluguel = new Aluguel(name, email);
            vet[quarto] = aluguel;
        }
        System.out.println();
        System.out.println("quartos ja alugados: ");
        for (int i = 0; i < 10; i++) {
            if (vet[i] != null) {
                System.out.println(i+": " + vet[i]);
            }

        }


    }
}
