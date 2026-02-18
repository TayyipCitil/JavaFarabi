package Week03;

public class Ders02 {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(factorial(i) + " ");
        }
    }
    static int factorial(int num) {
        int sonuc = 1;
        for (int i = 1; i <= num; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}
