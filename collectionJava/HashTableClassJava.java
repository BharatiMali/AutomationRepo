package collectionJava;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

public class HashTableClassJava {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new Hashtable<>();
        map.put(1,"Solapur");
        map.put(2, "Pune");
        map.put(3,"Satara");
        map.put(4,"Kolhpur");
        map.put(5,"Mumbai");
        map.put(1,"Solapur");
        map.put(3,"Satara");
        map.put(8,"Solapur");
        System.out.println(map.put(2,"Partner"));
        for (Map.Entry<Integer,String> e: map.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());
        }






    }
}
