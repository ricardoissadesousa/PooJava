package introducaoPoo.application;

import introducaoPoo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangler width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("Area: "+rectangle.Area());
        System.out.println("Perimeter: "+rectangle.perimeter());
        System.out.println("Diagonal: "+rectangle.diagonal());



    }
}
