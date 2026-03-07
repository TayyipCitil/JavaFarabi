package Week05;

public class Kedi {
    private static int kopekSayisi=0;
    String cins;
    String isim;
    int yas;

    Kedi(){
        kopekSayisi++;

    }

    public void havla(){
        System.out.println(this.isim);
        System.out.println("miyav");
    }
}
