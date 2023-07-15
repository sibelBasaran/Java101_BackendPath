package conditionalStatements;
import java.util.Scanner;
public class chineseZodiacSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] zodiacs = {"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Goat"};
        System.out.print("Enter year of birth:");
        int yearBirth = input.nextInt();
        System.out.print("Your Chinese Zodiac Sign: "+zodiacs[(yearBirth%12)]);
    }
}
