package Homework4;

import java.util.Scanner;

public class JavaHomework {


    public static void main(String[] args ) {

        printMonthNameFinder();
        printStringReverser();
        printFibonacciSeriesGenerator ();
        printWhileLoop ();

       int number = 10;

       if(number <= 2) {
           System.out.println("Even");
       } else {
           System.out.println("Odd");
       }
    }

    public static void printMonthNameFinder() {

        String month = "Februar";

        if(month.equals("January")) {
            System.out.println("month is January");
        } else if(month.equals("February")) {
            System.out.println("month is February");
        } else if(month.equals("March")) {
            System.out.println("month is March");
        } else if(month.equals("April")) {
            System.out.println("month is April");
        } else if(month.equals("May")) {
            System.out.println("month is May");
        } else if(month.equals("June")) {
            System.out.println("month is June");
        } else if(month.equals("July")) {
            System.out.println("month is July");
        } else if(month.equals("August")) {
            System.out.println("month is August");
        } else if(month.equals("September")) {
            System.out.println("month is September");
        } else if(month.equals("October")) {
            System.out.println("month is October");
        } else if(month.equals("November")) {
            System.out.println("month is November");
        } else {
            System.out.println("invalid month");
        }
    }
    private static void printStringReverser () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");

        String input = scanner.nextLine();
        String reversed = new String().toUpperCase();

        System.out.println("Reversed string:" + reversed);

    }

    private static void printFibonacciSeriesGenerator () {

        int n = 5;
        int firstNumber = 2, secondNumber = 4;
        System.out.println("Fibonacci Series");

        for (int i = 1; i <= 1; i++)
            System.out.println(" firstNumber:" + "");

    }

    private static void printWhileLoop (){

        int [] numbers = {3,5,8,-1};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -1) {
                break;
           }
       }
        int i = -1; // aici a trebuit sa mai adaug o variabila si sa ii dau o valoare . dc?
        sum += numbers[i];
        System.out.println( "Sum numbers:" + sum);

    }
}

