package collectionJava;

import java.io.IOException;
import java.util.ArrayList;

public class ExampleOfArrayClass {

public static void main(String [] args) throws IOException{
    ArrayList arrayList = new ArrayList();
    arrayList.add("Bharati");
    arrayList.add("Pankaj");
    arrayList.add("Golu");
    arrayList.add("Kunal");
    arrayList.add("Bharati");
    arrayList.add(10);
    arrayList.add(10.55f);
    arrayList.add('c');
    arrayList.add(null);
    arrayList.add(null);

    System.out.println(arrayList);
    for(Object o : arrayList){
        System.out.println(o);
    }

}
}
