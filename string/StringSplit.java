package string;

public class StringSplit {
    public static void main(String[] args){
        String p = "Wel Come To Digital Partner";
        String [] array = p.split( " " );


        System.out.println(array.length);
        for(String p1 :  array){
            System.out.println(p1);
        }
    }
}
