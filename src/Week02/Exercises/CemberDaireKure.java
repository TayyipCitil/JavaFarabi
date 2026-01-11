package Week02.Exercises;

public class CemberDaireKure {
    static void main() {
        int yaricap = 5;
        char secim = 'd';//c(cember),d(daire),k(kure)
        switch (secim) {
            case 'c':
                System.out.println("çevre = " + 2 * Math.PI * yaricap + "m");
                break;
            case 'd':
                System.out.println("alan = " + Math.PI * yaricap * yaricap + "m^2");
                break;
            case 'k':
                System.out.println("hacim = " + 4 / 3 * Math.PI * yaricap * yaricap * yaricap + "m^3");
                break;
        }
    }
}
