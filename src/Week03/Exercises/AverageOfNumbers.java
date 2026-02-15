package Week03.Exercises;

import java.util.Scanner;

public class AverageOfNumbers {
    //girilen N tane sayının ortalamasını hesaplayan program
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you enter?  ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+ ". number : ");
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("Average of numbers : " + sum/n);
    }
}
