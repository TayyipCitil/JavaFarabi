package Week05;

public class Ders01 {
    static void main() {
        recursive(1);
    }

    public static void recursive(int a){
        System.out.println(a);
        a++;
        if(a<20){
            recursive(a);
        }
    }
}
