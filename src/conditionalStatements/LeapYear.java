package conditionalStatements;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if(isLeapYear(year)){
            System.out.print(year + " is a leap year.");
        }else{
            System.out.print(year+ " is not a leap year.");
        }
        input.close();

    }
    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0 || year % 400 == 0){
                return true;
            }
            }
            return false;
        }
    }
