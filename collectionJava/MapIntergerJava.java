package collectionJava;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapIntergerJava {
    public static void main(String[] args)  throws IOException {
        Map<Integer, String>map = new HashMap();
        map.put(1,"Varundal");
        map.put(2,"Somaksh");
        map.put(3,"Shree");
        map.put(4,"Megha");
        map.put(5,"Radhika");
        map.put(1,"Vijaya");
        map.put(3,"Digital");
        map.put(6,null);
        map.put(7,null);
        System.out.println(map.get(2));

    }
}
