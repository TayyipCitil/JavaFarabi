package Week02.Exercises;

public class isInteger {
    static void main() {
        int sayi1 = 25;
        float sayi2 = 25.5f;

        if (sayi2%1==0) {
            System.out.println("integer");
        }else {
            System.out.println("not integer");
        }
        System.out.println("--------------");
        if (sayi2/1==sayi1) {
            System.out.println("integer");
        }else {
            System.out.println("not integer");
        }
    }
}
