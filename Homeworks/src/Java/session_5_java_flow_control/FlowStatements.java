package session_5_java_flow_control;

public class FlowStatements {
    public static void main (String[] args ) {
        int number =1;
        printNumberWhileDo(number);
        printNumberWhileDo(number);
        printNumberFor(10);
        int [] array = {1,2,3,4,5};
        printNumberForEach(array);

        int [] [] complexArray = {{1,2,3},{4,5,6},{7,8,9}};
        //
        printListofList(complexArray);
        printNumberUsingingBreak(2.5);







    }

    private static void printNumberUsingingBreak(double v) {
    }


    public static void printNumberWhileDo(int number) {

        while (number <= 10) {
            System.out.println("number is:" + number );
            number++;
        }
    }
     public static void printNumberDoWhile(int number) {
        do {
            System.out.println("number is:" + number);
            number++;
        } while (number <= 10);
        }

        public static void printNumberFor ( int number){
         for (int i = 0; i<= number ; i++) {
             System.out.println( " number is:" + i);
         }
        }

    public static void printNumberForEach ( int [] array){
        for ( int number : array ){
            System.out.println(" numbner from array is: " + number);
        }
    }

   public static void printListofList (int [] [] complexArray){
        for (int [] simpleArray: complexArray){
            for ( int i = 0 ; i<simpleArray.length; i++) {
                System.out.print(simpleArray[i]);
            }
            System.out.println();
        }
   }

   public static void printNumberUsingingBreak(int number1 , int number2){
        int i = 0;
        while (i <= 10){
            if( i == number1) {
                i = i +1 ;
                continue;
            }

                if (i== number2){
                    break;

            }
            System.out.println("number is:" + i++);
        }
   }
}

