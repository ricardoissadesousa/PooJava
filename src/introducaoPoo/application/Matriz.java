package introducaoPoo.application;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da Matriz: ");
        int n = sc.nextInt();

        int [] [] mat = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main Diagonal: "); // pega a diagonal principal
        for(int i = 0; i < n; i++){
            System.out.print(mat[i][i]+ " ");
        }
        System.out.println();

        int cont = 0;
         for(int i = 0; i < n; i++){ // verifica quantos Numeros Negativos possui na matriz
             for(int j = 0; j < n; j++){
                 if(mat[i][j] < 0){
                     cont++;

                 }
             }
         }
        System.out.println("Negative Numbers: "+cont);
    }
}
