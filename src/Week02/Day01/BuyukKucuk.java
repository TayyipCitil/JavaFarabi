package Week02.Day01;

public class BuyukKucuk {
    static void main() {
        int sayi1=20;
        int sayi2=10;

        if (sayi1>sayi2){
            System.out.println(sayi1 + " büyüktür "+ sayi2);
        } else if (sayi1<sayi2) {
            System.out.println(sayi2 + " büyüktür "+ sayi1);
        }else {
            System.out.println(sayi2 + " eşittir "+ sayi1);
        }
    }
}