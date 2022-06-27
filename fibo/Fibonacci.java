package fibo;

import java.util.Scanner;

public class Fibonacci {
    public static int recursiveFibo(int number) {
        if (number <= 0) {
            return number;
        }
        else if(number==1){
            return 1;
        }else {
            return recursiveFibo(number - 1) + recursiveFibo(number - 2);
        }

    }
    public static void fibonacci(int number) {
        int num1 = 0, num2 = 1, counter = 0;
        System.out.println("Fibonacci Number:");
        while (counter < number) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scan.nextInt();
        fibonacci(number);
        recursiveFibo(number);
        System.out.println("\nRecursive fibo.Fibonacci Number:");
        for (int i = 0; i < number; i++) {
            System.out.print(recursiveFibo(i) + " ");
        }
    }
}
