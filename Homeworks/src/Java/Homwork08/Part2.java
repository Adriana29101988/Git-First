package Homwork08;

import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        studentNameLinkedList();
        fruitName();
    }
    /*
    Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that name from the list.
     */
    public static void studentNameLinkedList() {
        List<String> studentList = new LinkedList<>(List.of("Emanuel", "Maria", "Ben", "Katy"));
        System.out.println("numele studentilor" + studentList);
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        if (studentList.contains(studentName)) {
            studentList.remove(studentName);
            System.out.println("studentul" + studentName + "este eliminat din lista");
        }else {
            System.out.println("studentul"+studentName +"nu este in lista" );
        }
        System.out.println("Lista de studenți actualizată:");
        for (String student : studentList) {
            System.out.println(student);
        }
        scanner.close();
    }
    /*
    Create an ArrayList containing names of fruits. Implement a custom sorting mechanism to arrange them in descending order based on their length. If two fruits have the same length, sort them in alphabetical order.
     */
    public static void fruitName() {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Plum");
        fruitList.add("Pear");
        fruitList.add("Apple");
        fruitList.sort((fruit1, fruit2) -> {

            int lengthComparison = Integer.compare(fruit2.length(), fruit1.length());

            return lengthComparison != 0 ? lengthComparison : fruit1.compareTo(fruit2);
        });

        System.out.println("Lista de fructe sortată (descrescător după lungimea numelui și alfabetic pentru lungimi egale):");
        for (String fruit : fruitList) {
            System.out.println(fruit);

        }
    }
}