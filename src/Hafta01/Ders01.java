package Hafta01;

public class Ders01 {
    static void main() {
        int yumurtaUcreti = 5;
        double ekmekUcreti = 12.5;
        int ekmekAdedi = 1;
        int yumurtaAdedi = 20;

        //alış veriş listesi { 10 ekmek , 40 yumurta }

        ekmekAdedi*=10;
        yumurtaAdedi*=2;
        double toplam =ekmekAdedi * ekmekUcreti + yumurtaAdedi * yumurtaUcreti;
        System.out.println(toplam);
    }
}
