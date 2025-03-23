package Session8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.*;


public class MAIN {
    public static void main(String []args){
        arrayExemple ();
        arrayExemple2();
        arrayExemple3();
        arrayListExemple();
        linkedListExemple();
        multidimensionalExemple ();
        performance();
    }
    public static void arrayExemple (){
        String[] friends = {"Ion", "Bob","Dan", "Mioara"};
        out.println("one friend:" + friends[2]);
        out.println("dimensiunea lui friends:" + friends.length);
        friends [1] = "Marcel";
        out.println("friends pe pozitia 1 " + friends[1]);
        out.println("all my friends:" + Arrays.toString(friends));
    }

    public static void arrayExemple2(){
        int [] numbers = {15,24,7,4,90};
        out.println("all numbers :" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        out.println("all numbers sorted:" + Arrays.toString(numbers));
        int target = 7;
        int index = Arrays.binarySearch(numbers , target);
        out.println("pozitia unde a fost gasit target este: " + index);
        out.println("valoarea de pe pozitie este:"+ numbers[index]);
    }

    public static void arrayExemple3() {
        String [] cities = {"Iasi", "Bucuresti", "Cluj"};
        Arrays.sort(cities);
        out.println(Arrays.toString(cities));
        int index = Arrays.binarySearch(cities, "Bucuresti");
        out.println(index);
        out.println(cities[index]);
    }
    public static void arrayListExemple(){
       List<String> friends = new ArrayList<>(Arrays.asList("Ion", "Bob","Dan", "Mioara"));
        out.println("friend de pe pozitia 2:" +friends.get(2));
        out.println("dimensiunea lui friends:"+ friends.size());
        friends.add("Mirel");
        out.println("friends" + friends);
        friends.remove("Bob");
        out.println("friends" + friends);
        out.println("este oare Bob in friends?" + friends.contains("Bob"));
        out.println(friends);
        friends.set(1, "Bob");
        friends.add(2, "Mioara");
        out.println(friends);
    }
    public static void linkedListExemple(){

        List<String> list= new LinkedList<>();
        list.add("Ion");
        list.add("Bob");
        list.add("Dan");
        out.println("linkeList[1]:" + list.get(1));
        list.add(1,"Marcel");
        out.println("linkeList[1]:" + list.get(1));
        out.println(list);
        list.remove("Marcel");
        System.out.println(list);

        LinkedList<String> stack = new LinkedList<>();
        stack.push("Ion");
        stack.push("Bob");
        stack.push("Dan");
        out.println("stack" + stack);
        stack.pop();
        System.out.println("Stack"+ stack);

        stack.get(1);
        out.println(stack.get(1));
    }
    public static void multidimensionalExemple () {
        String[][] names = {
                {"Ms", "Mrs", "Mr"},
                {"Ion", "Marcel", "Mioara"}
        };
        out.println(names[0][0] + " " + names[1][2]);
        out.println(names[0][2] + " " + names[1][1]);

        for (int i = 1; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {

            }
        }
        out.println();

        for (String name : names[0]) {
            for (String name2 : names[1]) {
                out.println(name + " " + name2);
            }
            out.println();
        }
    } public static void performance(){
        final int size = 50000;
        List<String> arrayList= new ArrayList<>();
        List<String> linkedList = new LinkedList<>();


        for (int i = 0; i<size; i++){
            String value = String.valueOf(1);
            arrayList.add(value);
            linkedList.add(value);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i< 10000; i++) {
            arrayList.get(size/2);
        }
        long stopTimeArrayList = System.currentTimeMillis() - start;

        long startLinked =  System.currentTimeMillis();
        for (int i = 0; i< 10000; i++) {
            linkedList.get(size/2);
        }
        long stopTimeLinkedList = System.currentTimeMillis() - startLinked;
        out.println("access arrayList" + stopTimeArrayList);
        out.println("access linkedList" + stopTimeLinkedList);
    }
}
