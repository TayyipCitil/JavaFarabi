package Week03;
import java.util.Scanner;

public class Homework {
    //Girilen sayının basamaklarını yazan, 3 varsa duran program
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int sayi = scan.nextInt();
        int sayac=1,i;
        for (i = sayi; i > 0; i/=10) {
            System.out.println(sayac+".basamak:"+i%10);
            sayac++;
            if (i%10==3){
                System.out.println("3 bulundu");
                break;
            }
        }
        if (i==0){
            System.out.println("3 yok");
        }
    }
}
