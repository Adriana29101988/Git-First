package session_6_java_fcore_api;

import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        stringPool();
        StringOperators();
        StringMethods();
        sb();

    }

    public static void stringPool() {
        String str = "Hello World";
        String str1 = "Hello World";
        String str2 = new String("Hello World");
        String str3 = new String("Hello World");

        System.out.println("str == str1" + (str == str1));
        System.out.println("str location " + System.identityHashCode(str));
        System.out.println("str1 location " + System.identityHashCode(str1));

        System.out.println("str2 == str3" + (str2 == str3));
        System.out.println("str2 location " + System.identityHashCode(str2));
        System.out.println("str3 location " + System.identityHashCode(str3));

        System.out.println("str2 equals str3 " + str2.equals(str3));

        str1 = "hello world!";
        System.out.println("str == str1" + (str == str1));
        System.out.println("str location " + System.identityHashCode(str));
        System.out.println("str1 location " + System.identityHashCode(str1));
    }

    public static void StringOperators() {
        String code1 = "PROD12345";
        String code2 = new String("PROD12345");
        String code3 = "PROD12345";
        String code4 = "PROD";

        code4 += 1234;
        System.out.println("code4 este: " + code4);
        System.out.println("code1 == code4" + (code1 == code4));
        System.out.println("code1 == code3" + (code1 == code3));
        System.out.println("code1 == code2" + (code1 == code2));
        System.out.println("code2 == code4" + (code2 == code4));
    }

    public static void StringMethods() {

        String str1 = "Hello world!";
        String str2 = "hello world!";


        System.out.println("str1 equals str2 " + str1.equals(str2));
        System.out.println("str1 equals str2  ignore " + str1.equalsIgnoreCase(str2));
        System.out.println("dimensiunea lui str1 este: " + str1.length());
        System.out.println("afisam char la pozitia 2:" + str1.charAt(2));
        System.out.println("afisam pozitia lui l:" + str1.indexOf('H'));
        System.out.println("substringul lui str1 este:" + str1.substring(1, 9));
        System.out.println("substringul lui str1 este:" + str1.substring(3));
        System.out.println("lower: " + str1.toLowerCase());
        System.out.println("upper: " + str1.toUpperCase());

        System.out.println("starts with H " + str1.startsWith("He"));
        System.out.println("ends with d! " + str1.endsWith("d!"));
        System.out.println("ends with d " + str1.endsWith("d"));

        String str3 = "Hello World!";
        System.out.println("mijlocul lui str3 este:" + str3.length() / 2);
        int pozitiaMijloc = str3.length() / 2;
        String mijlocStr3 = str3.substring(pozitiaMijloc, pozitiaMijloc + 1);
        System.out.println("mijlocStr3 este: " + mijlocStr3);

        String str5 = "Hello    ";
        System.out.println("str5 folosind trim : " + str5.trim());

        String str4 = "Hello Hello Hello";
        System.out.println("split str4 este " + Arrays.toString(str4.split(" ")));


    }

    public static void sb() {
        StringBuilder sb = new StringBuilder(" Hello world!");
        System.out.println(sb);
        System.out.println("locatia lui sb inainte de append:" + System.identityHashCode(sb));
        sb.append("Hello ");
        System.out.println(sb);
        System.out.println(("locatia lui sb dupa de append:" + System.identityHashCode(sb)));

        String[] names = {"Ion", "Dan", "Marius"};
        StringBuilder sbNames = new StringBuilder();
        for (String name : names) {
            sbNames.append(name).append(" ");
        }
        System.out.println("sbNames este : " + sbNames);

        StringJoiner sj = new StringJoiner(" ");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(" StringJoiner sj este: " + sj);

        String result = "";
        for (int i = 0; i < 10; i++) {
            result += "a";
        }

            System.out.println(result);
    }
}
