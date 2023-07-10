package Fundamentals;
import java.util.Scanner;

public class DaireAlanHesapla {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı:" +alan);
        System.out.println("Dairenin Çevresi: "+cevre);

        System.out.println("Merkez açı ölçüsünü girin: ");
        double a = input.nextDouble();

        double dilimAlan = (3.14 * r * r * a) / 360;
        System.out.println("Daire diliminin alanı: " + dilimAlan);



    }
}
