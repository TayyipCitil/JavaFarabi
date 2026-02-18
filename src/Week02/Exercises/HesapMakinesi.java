package Week02.Exercises;

import java.util.Scanner;

public class HesapMakinesi {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi 1 gir: ");
        double sayi = input.nextDouble();
        System.out.print("sayi 2 gir: ");
        double sayi2 = input.nextDouble();
        input.nextLine();
        System.out.print("işlem : ");
        String secim = input.nextLine();

        switch (secim) {
            case "+":
                System.out.println(sayi + sayi2);
                break;
            case "-":
                System.out.println(sayi - sayi2);
                break;
            case "*":
                System.out.println(sayi * sayi2);
                break;
            case "/":
                System.out.println(sayi / sayi2);
                break;
        }
    }
}
