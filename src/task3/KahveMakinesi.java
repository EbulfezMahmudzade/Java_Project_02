package task3;

import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        // TODO 1. Koşul Bölümü
        String hangiKahve = "";

        System.out.println("Techno Cafe'ye Hoş Geldiniz");
        System.out.println("Hangi kahveyi istersiniz?");
        System.out.println("1. Türk Kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");

        while (hangiKahve.isEmpty()) {
            System.out.print("Kahve adı girin: ");
           String kahve = scannerStr.nextLine();

            if (kahve .equalsIgnoreCase("türk kahvesi") || kahve .equalsIgnoreCase("turk kahvesi")) {
                hangiKahve = "Türk Kahvesi";
            } else if (kahve .equalsIgnoreCase("filtre kahve")) {
                hangiKahve = "Filtre Kahve";
            } else if (kahve .equalsIgnoreCase("espresso")) {
                hangiKahve = "Espresso";
            } else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }

        System.out.println(hangiKahve + " hazırlanıyor...");

        // TODO 2. Koşul Bölümü
        while(true) {
            System.out.print("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
           String sut = scannerStr.nextLine();

            if (sut.equalsIgnoreCase("evet")) {
                System.out.println("Süt ekleniyor...");
                break;
            } else if(sut.equalsIgnoreCase("hayır") || sut.equalsIgnoreCase("hayir")){
                System.out.println("Süt eklenmiyor...");
                break;
            } else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }

        // TODO 3. Koşul Bölümü
        while(true) {
            System.out.print("Şeker ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
           String seker = scannerStr.nextLine();

            if (seker.equalsIgnoreCase("evet")) {
                System.out.print("Kaç şeker istersiniz?: ");
                int kacSeker = scannerInt.nextInt();
                System.out.println(kacSeker + " şeker ekleniyor...");
                break;
            } else if (seker.equalsIgnoreCase("hayır") || seker.equalsIgnoreCase("hayir")) {
                System.out.println("Şeker eklenmiyor...");
                break;
            } else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }

        // TODO 4. Koşul Bölümü
        String boyut = "";

        while(true) {
            System.out.print("Hangi boyutta istersiniz? (Büyük - Orta - Küçük olarak giriniz.) : ");
            boyut = scannerStr.nextLine();

            if (boyut.equalsIgnoreCase("büyük") || boyut.equalsIgnoreCase("buyuk")) {
                System.out.println("Kahveniz "+ boyut +" boyutta hazırlanıyor....");
                break;
            } else if (boyut.equalsIgnoreCase("orta")) {
                System.out.println("Kahveniz "+ boyut +" boyutta hazırlanıyor....");
                break;
            } else if (boyut.equalsIgnoreCase("küçük") || boyut.equalsIgnoreCase("kucuk")) {
                System.out.println("Kahveniz "+ boyut +" boyutta hazırlanıyor....");
                break;
            } else {
                System.out.println("Yanlış tuşlama. Lütfen tekrar deneyin.");
            }
        }

        System.out.println(hangiKahve + " " + boyut +"boy hazırdır. Afiyet olsun !");
        System.out.println("Techno Cafe'yi Tercih Ettiğiniz İçin Teşekkürler!");
    }
}
