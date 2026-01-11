package Week02.Exercises;

public class BirimCevirme {
    static void main() {
        double derece=-180;
        double radyan=derece*(Math.PI/180);
        System.out.println("derece= "+derece);
        System.out.println("radyan= "+radyan);
        System.out.println("cos(radyan)= "+Math.cos(radyan));
        System.out.println("--------------------------------");
        double celcius=25;
        double farenheit=celcius*1.8+32;
        double kelvin=celcius+273.15;
        System.out.println("celcius= "+celcius);
        System.out.println("farenheit= "+farenheit);
        System.out.println("kelvin= "+kelvin);
        System.out.println("--------------------------------");
        double cm =20;
        double feet=cm*0.0328083989501;
        double inc=cm*2.54000508001016;
        System.out.println("cm= "+cm);
        System.out.println("feet= "+feet);
        System.out.println("inc= "+inc);
        System.out.println("----------------------------------");
        double saniye=3600;
        double dakika=saniye/60;
        double saat=dakika/60;
        System.out.println("saniye= "+saniye);
        System.out.println("dakika= "+dakika);
        System.out.println("saat= "+saat);
    }
}
