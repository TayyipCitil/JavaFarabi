package Hafta02.Ders02;

public class ornek3 {
    static void main() {
        double finalNot = 50;
        double vize = 90;
        double ortalama=finalNot * 0.6 + vize * 0.4;

        System.out.println(" ortalama: " + ortalama  );
        /*
        if(ortalama>=50 && finalNot>50 ){
            System.out.println("geçtiniz");
        }else {
            System.out.println("kaldınız");
        }

         */
        if (ortalama>=90){
            System.out.println("AA");
        } else if (ortalama>=70) {
            System.out.println("AB");
        } else if (ortalama>=50) {
            System.out.println("BB");
        }else {
            System.out.println("FF");
        }


    }
}
