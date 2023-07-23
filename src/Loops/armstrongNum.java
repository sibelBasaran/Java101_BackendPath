package Loops;
import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int gecici = sayi;

        while (gecici != 0){
            int basamak = gecici %10;
            toplam += basamak;
            gecici /= 10;

        }
        System.out.println("Sayının basamakları toplamı: "+toplam);
    }
}
