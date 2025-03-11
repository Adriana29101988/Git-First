package session_5_java_flow_control;

import java.util.Scanner;

public class SwitchStatements {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FREYDAY = 5;


    public static void main(String[] args) {

        printDayOfWeekSinpeEdition();
        printGrade();


    }

     private static void printDayofWeekSimpleEdition () {


        Scanner input = new Scanner(System.in);
        System.out.println("Insert day of week (1-5):");
        int day = input.nextInt();

        switch (day) {
            case MONDAY:
                System.out.println("today ist Monday");
                break;

            case TUESDAY:
                System.out.println("today ist Tursday");
                break;
            case WEDNESDAY:
                System.out.println("today ist Wednesday");
                break;
            case THURSDAY:
                System.out.println("today ist Thursday");
                break;
            case FREYDAY:
                System.out.println("today ist Freiday");
                break;
            default:
                System.out.println("invalid day");
        }

    }

    private static void printDayOfWeekSinpeEdition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert day of week (1-5):");
        int day = input.nextInt();

        Object so;
        switch (day) {
            case MONDAY -> System.out.println("today is Monday");
            case TUESDAY -> System.out.println("today is Tuesday");
            case WEDNESDAY -> System.out.println("today is Wednesday");
            case THURSDAY -> System.out.println("today is Thuesday");
            case FREYDAY -> System.out.println("today is Freiday");
            default -> System.out.println("invalid day");
        }
    }


    private static void printGrade(){
        Scanner input = new Scanner(System.in);
        System.out.println("PleaseInsert a Grade (A, B, C,D:");
        String gradeString = input.nextLine (). toUpperCase();
        char grade = gradeString.charAt(0);
        char grade2 = 'A';

        switch (grade){
            case 'A' ->System.out.println("excelent");
            case 'B' ->System.out.println("good");
            case 'C' ->System.out.println("almost good");
            case 'D' ->System.out.println("bad");
             default -> System.out.println("invalid grade");}
}

}
