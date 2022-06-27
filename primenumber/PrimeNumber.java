package primenumber;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrimeNumber(int number, int i) {
        if (number <= 2)
            return (number == 2) ? true : false;
        if (number % i == 0)
            return false;
        if (i * i > number)
            return true;
        return isPrimeNumber(number, i + 1);
    }
    static String primeNumber(int number) {
        boolean isPrime = true;
        if (number == 1) {
            return "not a prime number";
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                return "a prime number";
            } else {
                return "not a prime number";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();
        String result = primeNumber(number);
        System.out.println(number + ":" + result);
        if (isPrimeNumber(number, 2))
            System.out.println(number + ":a prime number");
        else
            System.out.println(number + ":not a prime number");
    }
}





