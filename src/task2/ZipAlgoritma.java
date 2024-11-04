package task2;

import java.util.Scanner;

public class ZipAlgoritma {

    // Test için kullanılan main metodu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ziplenecek metni giriniz: ");
        String inputText = scanner.nextLine();

        // Sıkıştırılmış metni tutmak için boş bir dize oluşturulur
        String compressedText = "";

        // Metnin her karakteri için döngü
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);

            // Bu karakter daha önce işlenmişse, atla
            if (compressedText.indexOf(currentChar) != -1) {
                continue;
            }

            // Bu karakterin sayısını say
            int count = 0;
            for (int j = 0; j < inputText.length(); j++) {
                if (inputText.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Karakter ve sayısını sıkıştırılmış metne ekle
            compressedText += count + "" + currentChar;
        }

        // Sonuç ekrana yazdırılır
        System.out.println("Sıkıştırılmış metin: " + compressedText);
    }
}
