package Homework3;

public class Java_Operators {
    public static void main(String[] args) {
        // ex 1

        String stringOne = "OpenAi";
        String stringTwo = "Open Ai";

        if (stringOne == stringTwo) { // verific daca cele 2 Stringuri au acelasi obiect
            System.out.println("Both strings has the same object.");
        } else {
            System.out.println("The string has different objects.");

            // ex 2

            String firstString = " Hallo";
            String secondString = " Hallo";

            System.out.println(firstString.equals(secondString));

        }

        {
            System.out.println("the two numbers are equal");

            String stringThree = "Cat";
            String stringFour = "Cat";

            if (stringThree == stringFour) {
                System.out.println("the strings are equal");
            } else {
                System.out.println("the strings are not equal");
            }

            // ex 3


            int age = 20;
            if (age >= 18) {
                System.out.println("I am adult");
            } else {
                System.out.println("I am not an adult");

                // ex 4

                int heightOne = 160;
                int heightTwo = 150;

                boolean maximumHeigh = (heightOne > heightTwo);
                System.out.println("The greater hight is:" + maximumHeigh);

                int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
                System.out.println("The greater Height is:" + maximumHeight);

                // ex 5

                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);

                }
                System.out.println("valoarea lui i este:");

                // ex 6

                int Temerature1 = 30;
                int Temperature2 = 20;
                int Temperatur3 = 10;

                if (Temerature1 > 30) ;
                System.out.println("Hot");

                if (Temperature2 < 20) ;
                System.out.println("Warm");

                if (Temerature1 > 30) ;
                {
                    System.out.println("Hot");

                }
                if (Temerature1 >= 20 && Temperature2 <= 30) {
                    System.out.println("Warm");
                } else {
                    System.out.println("Cold");
                }
                // ex 7

                int sideOne = 7;
                int sideTwo = 7;
                int sideThree = 5;

                if (sideOne == sideTwo) {
                    System.out.println(" The Triangle ist Isoscel");

                } else if (sideOne == sideTwo && sideTwo == sideThree) {
                    System.out.println("The Triangle ist Equilateral");
                } else {
                    System.out.println("The Triangle ist Scalene");

                }
            }
        }           // ex 8

        int number = 2;
        int factorial = 3;

        for (int i = 3; i <= 2; i++) {
            factorial *= i;
            System.out.println("The factrorial" + number + factorial);
        }
        // ex 9
        String countryOne = "USA";
        String countryTwo = "UK";

        System.out.println(countryOne.equals(countryTwo));

        // ex 11

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int additionResult;
        int multiplicationResult;

        additionResult = a + b;
        multiplicationResult = c + d;

        System.out.println("Addition Result:" + additionResult);
        System.out.println("Multiplication Result:" + multiplicationResult);

        // ex 12

        int m = 25;

        int negativeNumber = -m;
        System.out.println(" Original Number:" + m);
        System.out.println(" Negative Number: " + negativeNumber);
    }
}
