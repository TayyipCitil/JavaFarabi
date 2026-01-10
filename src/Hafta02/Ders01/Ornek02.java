package Hafta02.Ders01;

public class Ornek02 {
    static void main() {
        int sayi1=20;
        int sayi2=10;

        if (sayi1>sayi2){
            System.out.println(sayi1 + " büyüktür "+ sayi2);
        } else if (sayi1<sayi2) {
            System.out.println(sayi2 + " büyüktir "+ sayi1);
        }else {
            System.out.println(sayi2 + " eşittir "+ sayi1);
        }
    }
}