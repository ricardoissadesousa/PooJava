package introducaoPoo.application;

import java.util.Scanner;

public class Vetore1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vect =  new double[n];

        for (int i = 0; i < 0 ;i++){
                vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for(int i = 0 ; i < n ; i++){
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.println("AVerage Height: "+ avg);
    }
}
