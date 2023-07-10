package conditionalStatements;
import java.util.Scanner;
public class numbersDivisibleby3and4 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count != 0) {
            double average = (double) sum / count;
            System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3'e ve 4'e tam bölünen sayı bulunamadı.");
        }

            }
        }
