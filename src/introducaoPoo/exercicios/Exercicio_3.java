package introducaoPoo.exercicios;


import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas Pessoas serão Digitadas: ");
        int n = sc.nextInt();
        double[] vet = new double[n];
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

        }
        double menorPor = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] > 16) {
                menorPor++;
            }

        }
        double media = 0;
        for (int i = 0; i < n; i++) {
            media += alturas[i];

        }

        media = media / n;
        double porcentagem = (menorPor / n) * 100;
        System.out.printf("Media dos Pessoas Digitadas: %.2f%n", media,porcentagem);
        System.out.printf("Porgentagem de Pessoas Com menos de 16 anos: %.2f%n",porcentagem);
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }


        }

    }
}
