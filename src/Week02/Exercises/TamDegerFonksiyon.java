package Week02.Exercises;

public class TamDegerFonksiyon {
    static void main() {
        double sayi=23.7;

        double ondalikliKisim=sayi%1;

        double tamKisim=sayi-ondalikliKisim;

        System.out.println(tamKisim);
        System.out.println("---------------");
        System.out.println((int) (sayi));
    }
}
