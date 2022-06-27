package palindrom;

import java.util.Scanner;

public class Palindrom {
    static boolean stringPalindrom(String word) {
        String letter = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            letter += word.charAt(i);
        }
        System.out.println("String reverse:" + letter);
        if (letter.equals(word)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.nextLine();
        boolean isPalindrom = stringPalindrom(word);
        String result = isPalindrom ? "is palindrom" : "is not palindrom";
        System.out.println(isPalindrom + ": " + result);
    }
}
