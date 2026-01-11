package Week02.Exercises;

public class BagdasikSayiMi {
    static void main() {
        int sayi1 = 17;
        int sayi2 = 13;

        if (sayi1 % 10 + sayi2 % 10 == 10 && sayi1/10 == sayi2/10) {
            System.out.println("bağdaşık sayı");
        }else {
            System.out.println("bağdaşık sayı değiller");
        }
    }
}
