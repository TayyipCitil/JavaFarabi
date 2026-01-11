package Week01.Homework;

public class ATM {
    static void main() {
        int cekilecekTutar=530;
        int ikiYuzlukBanknontAdedi=cekilecekTutar/200;
        cekilecekTutar%=200;
        int yuzlukBanknontAdedi=cekilecekTutar/100;
        cekilecekTutar%=100;
        int onlukBanknontAdedi=cekilecekTutar/10;
        cekilecekTutar%=10;

        System.out.println(ikiYuzlukBanknontAdedi+ " tane 200TL ");
        System.out.println(yuzlukBanknontAdedi + " tane 100TL ");
        System.out.println(onlukBanknontAdedi+ " tane 10TL ");
    }
}
