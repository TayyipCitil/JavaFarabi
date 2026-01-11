package Week02.Exercises;

public class CakisikParalelKesisikDogru {//ax+by+c
    static void main() {
        double a1 = 2;
        double b1 = 4;
        double c1 = 16;
        double a2 = 4;
        double b2 = 8;
        double c2 = 32;

        if(a1/a2!=b1/b2){
            System.out.println("kesişik");
        } else if (b1/b2!=c1/c2) {
            System.out.println("paralel");
        }else {
            System.out.println("çakışık");
        }
    }
}
