package collectionJava;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionJava {
    public static void main(String[] args){
        Set<String> test = new HashSet<>();
        test.add("Java Programming");
        test.add(null);
        test.add("Hi");
        test.add("Java Programming");
        test.add("JDK");
        test.remove( "Hi");
        System.out.println(test);
        for (Object o : test){
            System.out.println(o);
        }


    }
}
