package Week02.Homework;

public class AktiviteOneri {
    static void main() {
        int derece=25;

        if(derece<0){
            System.out.println("Kayak");
        } else if (derece<=25) {
            System.out.println("piknik");
        } else if (derece<40) {
            System.out.println("yüzme");
        }
    }
}
