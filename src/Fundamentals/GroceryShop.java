package Fundamentals;
import java.util.Scanner;

public class GroceryShop {
    public static void main(String[] args) {

        double applePrice = 3.67, pearPrice = 2.14, tomatoPrice = 1.11, bananaPrice = 0.59, eggplantPrice = 5.00;
        double appleKg,pearKg,tomatoKg,bananaKg,eggplantKg;

        Scanner input= new Scanner(System.in);
        System.out.print("Enter apple's kg: ");
        appleKg = input.nextDouble();
        System.out.print("Enter pear's kg: ");
        pearKg = input.nextDouble();
        System.out.print("Enter tomato's kg: ");
        tomatoKg = input.nextDouble();
        System.out.print("Enter banana's kg: ");
        bananaKg = input.nextDouble();
        System.out.print("Enter eggplant's kg ");
        eggplantKg = input.nextDouble();

        double totalAmount = (appleKg * applePrice)+(pearKg * pearPrice)+(tomatoKg * tomatoPrice)+(bananaKg * bananaPrice)+(eggplantKg * eggplantPrice);
        System.out.println("Total amount is: " +totalAmount+"$");

    }
}
