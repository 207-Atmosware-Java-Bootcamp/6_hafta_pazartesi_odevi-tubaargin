package perfectnumber;

import java.util.Scanner;

public class PerfectNumber {
    static void perfectNumber(int number) {
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " is perfect number");
        } else {
            System.out.println(number + " is not perfect number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scan.nextInt();
        perfectNumber(number);
    }
}
