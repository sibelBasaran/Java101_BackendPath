package Fundamentals;
import java.util.Scanner;

public class notOrtalamasiHesapla {
    public static void main(String[] args) {


    //değişkenleri olustur
    int mat,fzk,kmy,trkc,tarih,mzk;

    //scanner sınıfımızı tanımladık
    Scanner inp = new Scanner(System.in);

    //kullanıcıdan değerlerı al
        System.out.println("Matematik notunuz: ");
    mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
    fzk = inp.nextInt();

        System.out.println("Kimya notunuz: ");
    kmy = inp.nextInt();

        System.out.println("Türkçe notunuz: ");
    trkc = inp.nextInt();

        System.out.println("Tarih notunuz: ");
    tarih = inp.nextInt();
        System.out.println("Müzik notunuz: ");
    mzk = inp.nextInt();


    double ort =(mat+fzk+kmy+trkc+tarih+mzk) /6.0;
        System.out.println("Not ortalamanız:" + ort);



        System.out.println(ort > 60.0 ? "Başarılı" : "Kaldı" );

    //String sonuc = (ort > 60) ? "Başarılı" : "Kaldı";
    //System.out.println("Sonuc => " + sonuc);



}
}
