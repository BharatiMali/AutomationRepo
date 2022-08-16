package collectionJava;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ProJavaClassExample {

    public static void main(String[] args) throws IOException,InterruptedException {
    FileReader file = new FileReader("C:\\Bharati\\MorningBatchExample2.properties");
    Properties properties = new Properties();
    properties.load(file);
        System.out.println(properties.getProperty("UserName"));
        System.out.println(properties.getProperty("Password"));
        System.out.println(properties.getProperty("Java Class Properties"));


}
}
