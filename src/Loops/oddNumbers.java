package Loops;
import java.util.Scanner;
public class oddNumbers {
    public static void main(String[] args) {
        /*int n;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            n = scan.nextInt();
            if(n % 2 == 1){
                total += n;
            }

        }while(n>0);
        System.out.println("Total: "+total); */
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            number = input.nextInt();
            if(number %2 == 0 && number %4 == 0){
                sum += number;
            }

        }while(number > 0);
        System.out.println("Sum of even numbers and multiple of 4: " +sum);
    }
}
