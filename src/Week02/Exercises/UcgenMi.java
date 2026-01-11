package Week02.Exercises;

public class UcgenMi {
    static void main() {
        double ayrit1 = 1;
        double ayrit2 = 2;
        double ayrit3 = 3;

        if(ayrit1 + ayrit2>ayrit3 && ayrit1+ayrit3>ayrit2 && ayrit2+ayrit3>ayrit1) {
            System.out.println("üçgen oluşturulabilir");
        }else {
            System.out.println("üçgen oluşturulamaz");
        }
    }
}
