package Loops;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int n,i,counter=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n = input.nextInt();

        for(i=1; i<n; i++){
            if(n%i==0)
                counter+=i;


        }
        if(counter==n)
            System.out.println("The number "+n+" is a perfect number!");
        else
            System.out.println("The number "+n+" is not a perfect number.");
    }
}
