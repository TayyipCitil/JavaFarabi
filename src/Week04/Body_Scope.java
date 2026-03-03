package Week04;

public class Body_Scope {//tekrar ettik
    boolean deger = true;

    public void dunya() {
        int altin = 5;
        if (deger) {//Türkiye
            int tl = 5;
            altin = 7;
            if (deger) {//Sivas
                int hamsi = 56;
                altin = 8;
                tl = 3;
                if (deger) {//merkez
                    hamsi = 45;
                }
            }
        }
    }
}