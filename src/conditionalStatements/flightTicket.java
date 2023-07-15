package conditionalStatements;
import java.util.Scanner;

public class flightTicket {
    public static void main(String[] args) {
     int age, flightType;
     double price, distance;

     Scanner input = new Scanner(System.in);
        System.out.print("Enter distance(km): ");
        distance = input.nextDouble();
        System.out.print("Enter age: ");
        age = input.nextShort();
        System.out.print("Select Flight Type (1-One Way / 2-Round Trip:" );
        flightType = input.nextShort();

        if (distance <= 0 || age <= 0 || (flightType != 1 && flightType != 2)) {
            System.out.print("Incorrect Data!");
            return;
        }

        double normalPrice = distance * 0.10;

        double sale = 0;

        if (age < 12) {
            sale = normalPrice * 0.50;
        } else if (age >= 12 && age <= 24) {
            sale = normalPrice * 0.10;
        } else if (age > 65) {
            sale = normalPrice * 0.30;
        }

        double salePrice = normalPrice - sale;

        if (flightType == 2) {
            salePrice *= 0.80; // Round-trip sale
        }

        double totalPrice = flightType == 2 ? salePrice * 2 : salePrice;

        System.out.println("Total Price = " + totalPrice + " $");




    }
}
