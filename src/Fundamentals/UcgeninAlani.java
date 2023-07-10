package Fundamentals;
import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         double a,b,c;

        System.out.println("1.kenar uzunluğunu girin: ");
        a = input.nextDouble();
        System.out.println("2.kenar uzunluğunu girin: ");
        b = input.nextDouble();
        System.out.println("3.kenar uzunluğunu girin: ");
        c = input.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);


    }
}
