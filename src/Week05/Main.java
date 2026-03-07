package Week05;

public class Main {
    static void main() {
        Kedi kedi1 =new Kedi();
        kedi1.yas=3;
        kedi1.isim="boncuk";
        kedi1.cins="tekir";


        Kedi kedi2 =new Kedi();
        kedi2.yas=2;
        kedi2.isim="kara";
        kedi2.cins="siyam";

        kedi1.havla();
        kedi2.havla();



    }
}
