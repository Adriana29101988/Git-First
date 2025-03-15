package Homework_Beginner;

import java.util.Scanner;

public class Homework_Beginner {
    public static void main (String[] args) {
        stringPalindromeCheck ();



        StringBuilder sb = new StringBuilder ("Hello World");
        System.out.print("sb");

        StringBuilder reversedString = new StringBuilder ("input");
        sb.reverse();
        System.out.println("Reversed string" + sb.toString());

    }

    public static void stringPalindromeCheck () {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Stringul este poligrom");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Stringul este polindrom");
        } else {
            System.out.println("Stringul nu este polindrom");
            scanner.close();
        }

    }

}
