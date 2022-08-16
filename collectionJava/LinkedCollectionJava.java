package collectionJava;

import java.util.LinkedList;

public class LinkedCollectionJava {

    public static void main(String[] args){
        LinkedList<String> test = new LinkedList<>();
        test.add("Software Testing");
        test.add("Varundal");
        test.add("Bharati");
        test.add((null));
        test.remove( "Bharati");
        test.addFirst( "varundal");
        test.addLast( " paras");

        System.out.println(test);

        for (Object o: test)
        {
            System.out.println(o);
        }
    }
}
