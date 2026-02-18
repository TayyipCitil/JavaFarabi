package Week03.Exercises;

public class FindNumbers {
    //20'den 1000'e kadar olan sayılar içerisinden 13'ün katı olan sayıları bulan program
    static void main() {
        long baslangic1 = System.nanoTime();
        for (int i = 20; i <= 1000; i++) {
            if(i % 13 == 0){
                System.out.print(i+" ");
            }
        }
        long bitis1 = System.nanoTime();
        long sure1 = bitis1 - baslangic1;

        System.out.println();

        //daha verimli hal
        long baslangic2 = System.nanoTime();
        for (int i = 20; i <=1000 ; i++) {
            if(i % 13 == 0){
                for(int j = i; j <=1000 ; j+=13){
                    System.out.print(j+" ");
                }
                break;
            }
        }
        long bitis2 = System.nanoTime();
        long sure2 = bitis2 - baslangic2;

        System.out.println("\nsüre1= "+sure1+"ns\nsüre2= "+sure2+"ns");
    }
}
