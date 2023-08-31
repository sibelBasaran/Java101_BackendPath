package Loops;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob=1;


        for(int i = n1; i >= 1; i--){
            //System.out.println(i);
            if(n1%i==0 && n2%i==0){
                ebob = i;
               // System.out.println(ebob);
                break;
            }
        }
        for( int k=1; k<=(n1*n2); k++){
            if(k%n1==0 && k%n2==0){
                System.out.println(k);
                break;
            }
        }
        System.out.println((n1*n2)/ebob); */
        // odev - Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız //

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok = n1 * n2;
        int i=1;

        while(i <= n1){
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);


        while(i<=n1*n2){
            if(i%n1==0 && i%n2==0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.print("Ekok: " + ekok);
    }

}



