package introducaoPoo.exercicios;

import java.util.Scanner;

public class Exercicio_1 {
    // Vetores
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos Numeros voçe quer digitar: ");
        int n = sc.nextInt();
        double[] vet = new double[n];


        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double  vetVal = vet[i];

            if (vetVal < 0) {
                System.out.println("valores negativos: " + vetVal);
            }
        }
    }
}
