package fileClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Program Files\\Java\\jdk-11.0.15.1");
        FileReader fileReader = new FileReader(file);
        int i;
        while((i= fileReader.read())!=-1){
            System.out.println((char)i);
        }
        fileReader.close();
    }
}
