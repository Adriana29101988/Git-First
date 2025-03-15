package Homework_Beginner;

public class Homework_Beginner2 {
    public static void main (String[] args) {
        stringEffientConcatenare ();
        stringVowels();
        stringCapitalize();



        StringBuilder sb = new StringBuilder("Hello People");
        System.out.print("sb");
        String reversed = sb.reverse ().toString();
        System.out.print("sb");
        sb.append("Hello");
        System.out.print("sb");
        sb.append("People");
        System.out.print("sb");

        String result = sb.toString();
        System.out.println(result);
    }
    public static void stringEffientConcatenare () {
        String [] countrys = {"Italy", "Greece", "Spain"};
        StringBuilder sbCountry = new StringBuilder(" ");
         for(String country : countrys);
         sbCountry.append(countrys).append(" ");
        System.out.println("sbCountrys este:" + sbCountry);
    }

    public static void stringVowels() {
        String sb= "Vara";
        StringBuilder vocale = new StringBuilder (); // pentru a le salva

        for (int i = 0; i < sb.length(); i++) { //parcurgem cuvintele
            char c = sb.charAt(i);
            if (!vocale.isEmpty()) {
            } else { //verificam daca sunt vocale
                vocale.append(c);
            }

            System.out.println("Vocalele din cuvântul" + sb + vocale.toString());

        }
    }

    public static void stringCapitalize(){
        StringBuilder sb = new StringBuilder("culoare, masina");
        String sub = sb.substring(sb.indexOf("c"), sb.indexOf( "m"));
        int ch = sb.length();
        int len = sb.charAt(3);
        System.out.println( sub + " " +len + ch);




    }

}
