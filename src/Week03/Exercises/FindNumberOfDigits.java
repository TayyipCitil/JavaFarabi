package Week03.Exercises;

import java.util.Scanner;

public class FindNumberOfDigits {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi= ");
        long sayi=scan.nextLong();
        int basamakSayisi=0;
        for (long i = sayi; i > 0 ; i/=10) {
            basamakSayisi++;
        }
        System.out.println(basamakSayisi);
    }
}
