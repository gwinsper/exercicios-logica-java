package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;
public class Program {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       Product product = new Product();


        System.out.print("Enter product data:\nName: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextInt();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);


sc.close();
    }

}
