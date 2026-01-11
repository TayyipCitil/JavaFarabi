package Week02.Exercises;

public class ArtikYil {
    static void main() {
        int yil=2026;

        if(yil%400==0){
            System.out.println("artik yil");
        }else if(yil%100==0) {
            System.out.println("artik yil değil");
        }else if(yil%4==0) {
            System.out.println("artik yil");
        }else {
            System.out.println("artik yil değil");
        }
    }
}
