package Week02.Exercises;

public class BigNum {
    static void main() {
        int sayi1 = 20;
        int sayi2 = 30;
        int sayi3 = 10;

        if (sayi1 > sayi2) {
            if (sayi1 > sayi3) {
                System.out.println(sayi1);
            } else {
                System.out.println(sayi3);
            }
        } else {
            if (sayi2 > sayi3) {
                System.out.println(sayi2);
            } else {
                System.out.println(sayi3);
            }
        }
        System.out.println("--------------------");
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println(sayi1);
        } else if (sayi2>sayi1 && sayi2 >sayi3) {
            System.out.println(sayi2);
        }else {
            System.out.println(sayi3);
        }
        System.out.println("--------------------");
        System.out.println(sayi1 > sayi2 ? (sayi1 > sayi3 ? sayi1 : sayi3) : (sayi2 > sayi3 ? sayi2 : sayi3));

    }
}
