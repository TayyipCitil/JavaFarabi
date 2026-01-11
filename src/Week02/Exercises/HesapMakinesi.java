package Week02.Exercises;

public class HesapMakinesi {
    static void main() {
        double sayi = 1.6;
        double sayi2 = 23;
        char secim = '*';

        switch (secim) {
            case '+':
                System.out.println(sayi + sayi2);
                break;
            case '-':
                System.out.println(sayi - sayi2);
                break;
            case '*':
                System.out.println(sayi * sayi2);
                break;
            case '/':
                System.out.println(sayi / sayi2);
                break;
        }
    }
}
