package Week04;

import java.util.Scanner;

public class Homework {//hesap makinesi metodlar ile

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(+ - * / % ^)İşleminizi seçin:  ");
        char select = scanner.nextLine().charAt(0);
        System.out.print("Sayi 1: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Sayi 2: ");
        double sayi2 = scanner.nextDouble();
        switch (select) {
            case '+':
                System.out.println(sayi1 + " + " + sayi2 + " = " + sum(sayi1,sayi2));
                break;
            case '-':
                System.out.println(sayi1 + " - " + sayi2 + " = " + subtract(sayi1,sayi2));
                break;
            case '*':
                System.out.println(sayi1 + " * " + sayi2 + " = " + multiply(sayi1,sayi2));
                break;
            case '/':
                System.out.println(sayi1 + " / " + sayi2 + " = " + division(sayi1,sayi2));
                break;
            case '%':
                System.out.println(sayi1 + " % " + sayi2 + " = " + mod(sayi1,sayi2));
                break;
            case '^':
                System.out.println(sayi1 + " ^ " + sayi2 + " = " + Math.pow(sayi1,sayi2));
                break;
        }
    }

    public static double sum(double a, double b) {
        return a+b;
    }
    public static double sum(double a, double b,double c) {
        return a+b+c;
    }
    public static double sum(double a, double b,double c,double d) {
        return a+b+c+d;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double mod(double a, double b) {
        return a % b;
    }

}
