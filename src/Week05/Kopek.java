package Week05;

public class Kopek {
    private static int kopekSayisi=0;
    String cins;
    String isim;
    int yas;

    Kopek(){
        kopekSayisi++;

    }

    public void havla(){
        System.out.println(this.isim);
        System.out.println("hav");
    }
}
