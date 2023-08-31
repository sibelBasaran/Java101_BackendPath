package Loops;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.println("Kullanıcı adınızı giriniz:");
            userName = input.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Kodluyoruz bankasına Hoşgeldiniz.");

                do {
                    System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Para miktari:");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            System.out.println("Yeni bakiyeniz:"+balance);
                            break;
                        case 2:
                            System.out.println("Para miktarı:");
                            int withdrawAmount = input.nextInt();
                            balance -= withdrawAmount;
                            System.out.println("Kalan bakiyeniz:"+balance);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:"+balance);
                            break;
                        case 4:
                            System.out.println("İyi günler dileriz..");
                            break;
                        default:
                            System.out.println("Geçersiz bir seçim yaptınız!");
                            break;

                    }


                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı adı veya şifre girdiniz.Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız:" + right);
                }
            }

        }
    }
}
