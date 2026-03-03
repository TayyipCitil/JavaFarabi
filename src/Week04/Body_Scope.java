package Week04;

public class Body_Scope {//tekrar ettik
    public void dunya(){
        int altin=5;
        if(true){//Türkiye
            int tl=5;
            altin=7;
            if(true){//Sivas
                int hamsi=56;
                altin=8;
                tl=3;
                if(true){//merkez
                    hamsi=45;
                }
            }
        }
    }
}