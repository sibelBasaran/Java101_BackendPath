package NesoAcademypractise;

import java.util.Scanner;

public class loopEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-1; j++)
            System.out.print(" ");

            for(int k=1; k<=2*i-1; k++)
                if(i==n)
                   System.out.print("*");
                else
                    if( k==1||k==2*i-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");

            System.out.println();

        }

    }
}
