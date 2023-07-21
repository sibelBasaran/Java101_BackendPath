package Loops;
import java.util.Scanner;
public class exponents {
    public static void main(String[] args) {
         /*int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = scan.nextInt();

        for(int i = 1 ;i <= n; i*=2){
            System.out.println(i);
        } */

        int number,res=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        for(int i=1; i<=number;i++){
            res= (int)Math.pow (5,i);
            System.out.println("Exponents of 5 : "+res);
        }
        System.out.println("------------------");
        for(int j =1; j<=number;j++){
            res= (int)Math.pow (4,j);
            System.out.println("Exponents of 4 : "+res);
        }


    }

    }

