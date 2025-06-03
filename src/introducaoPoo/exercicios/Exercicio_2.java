package introducaoPoo.exercicios;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vet = new double[n];

        for(int i = 0; i < vet.length; i++){
            vet[i] = sc.nextDouble();
        }
        System.out.println("Vetores"+Arrays.toString(vet));
        double soma = 0;
        for(int i = 0; i < n; i++){
            soma += vet[i];
        }


        System.out.println("Soma: " + soma);
        soma = soma / n;
        System.out.println("Media: "+ soma);

    }
}
