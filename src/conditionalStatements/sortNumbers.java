package conditionalStatements;
import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);
        System.out.print("1.number: ");
        num1 = input.nextInt();
        System.out.print("2.number: ");
        num2 = input.nextInt();
        System.out.print("3.number: ");
        num3 = input.nextInt();

        if (num1 <= num2 && num1<= num3) {
            if (num2 <= num3) {
                System.out.println("Sıralama: " + num1 + " < " + num2 + " < " + num3);
            } else {
                System.out.println("Sıralama: " + num1 + " < " + num3 + " < " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Sıralama: " + num2 + " < " + num1 + " < " + num3);
            } else {
                System.out.println("Sıralama: " + num2 + " < " + num3 + " < " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Sıralama: " + num3 + " < " + num1 + " < " + num2);
            } else {
                System.out.println("Sıralama: " + num3 + " < " + num2 + " < " + num1);
            }
        }
    }
}
