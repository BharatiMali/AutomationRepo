package collectionJava;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCollectionJava {
    public static void main(String[] args){
        SortedSet<String> test1 = new TreeSet<>();
        test1.add("Gaurav");
        test1.add("Raut");
        test1.add("satara");
        test1.add("div");
        test1.add("add");
        test1.add("sum");
        for (int i = test1.size()-1; i>=0; i--){
            System.out.println(i);

        }
        System.out.println(test1);
    }
}
