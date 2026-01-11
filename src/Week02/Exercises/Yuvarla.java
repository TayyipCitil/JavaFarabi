package Week02.Exercises;

public class Yuvarla {
    static void main() {
        double sayi=1.6;

        double ondalikliKisim=sayi%1;
        double tamKisim=sayi-ondalikliKisim;

        if(ondalikliKisim>=0.5){
            System.out.println(tamKisim+1);
        }else {
            System.out.println(tamKisim);
        }
    }
}
