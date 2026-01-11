package Week02.Exercises;

public class BiletFiyati {
    static void main() {
        int yas=55;
        int normalFiyat=25;
        if(yas>=65 || yas<5){
            System.out.println("ücretsiz");
        } else if (yas<18) {
            System.out.println(normalFiyat*0.5);
        } else if (yas==55) {
            System.out.println(normalFiyat*2);
        }else {
            System.out.println(normalFiyat);
        }
    }
}
