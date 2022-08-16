package string;

public class StringProgam {
    public static void main(String[] args) {

        // create a string
        String t1 = " Hirakani";
        String t2 = " Hirankani House";
        for (int i = 0; i <= t1.length() - 1; i++) {                 //CharAt
            System.out.println(t1.charAt(i));
        }
        System.out.println(t1.compareTo(t2));               //compare method
        System.out.println(t1.compareTo(t1));

        System.out.println(t1.concat(t2));        //concat method


        System.out.println(t1.length());          // length method
        System.out.println(t2.length());



    }
    }