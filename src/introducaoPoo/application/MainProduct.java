package introducaoPoo.application;

import introducaoPoo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
       Product product = new Product(name,price);



       product.setName("computador");
        System.out.println("Upadate Name: "+product.getName());
       product.setPrice(1200);


        System.out.println();
        System.out.println("Product Data: "+product);

        System.out.println();
        System.out.println("Enter the number of product to be added in stock: ");
        int  quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated Data: "+product);

        System.out.println();
        System.out.println("Enter the number of product to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated Data: "+product);






    }
}
