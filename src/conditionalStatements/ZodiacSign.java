package conditionalStatements;
import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        int month, day;
        String zodiagsign = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Month: ");
        month = input.nextInt();
        System.out.print("Day: ");
        day = input.nextInt();

        if ((month == 1 && day >= 21) || (month == 2 && day <= 19)) {
            zodiagsign = "Aquarius";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            zodiagsign = "Piches";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            zodiagsign= "Aries";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            zodiagsign = "Taurus";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            zodiagsign = "Gemini";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            zodiagsign = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiagsign = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiagsign = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiagsign = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiagsign = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiagsign = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 20)) {
            zodiagsign = "Capricorn";
        } else {
            System.out.println("You have entered an incorrect, try again!");
            return; // P
        }

        System.out.println("Your zodiac sign is : " + zodiagsign);
    }
    }
