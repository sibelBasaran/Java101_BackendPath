package Loops;
import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
       /* int n,k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scan.nextInt();
        System.out.print("Üst olacak sayıyı giriniz: ");
        k = scan.nextInt();
        int total = 1;
        int i = 1;

        while (i <= k){
            total*=n;
            i++;
        }
        System.out.println("Result:"+total); */
        int n,k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = scan.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = scan.nextInt();
         int total = 1;

        for(int i= 1; i <= k; i++){
            total *=n;
        }
        System.out.println("Result: "+total);

    }
}
