package Week04;

import java.util.Scanner;

public class Methods {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi gir:");
        int a=input.nextInt();
        System.out.println("sayi gir:");
        int b=input.nextInt();
        hi();
        hi2("Tayyip");
        hi2("Mehtap");
        double ozelSayi=pi();
        int toplam=sum(a,b);
        System.out.println(ozelSayi);
        System.out.println(toplam);
    }

    static public void hi(){
        System.out.println("Merhaba Dünya");
    }

    static public void hi2(String ad){
        System.out.println("Merhaba "+ad);
    }

    static public double pi (){
        return 3.14;
    }

    static public int sum(double sayi1, int sayi2){
        return (int)(sayi1+sayi2);
    }
}