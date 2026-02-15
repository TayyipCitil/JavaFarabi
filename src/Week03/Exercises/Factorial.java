package Week03.Exercises;

public class Factorial {
    static void main() {
        int sayi=5;
        int factorial=1;
        for (int i = 1; i <=sayi ; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
