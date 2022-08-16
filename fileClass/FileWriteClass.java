package fileClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteClass {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\hp\\IdeaProjects\\Bharatimaliautomationstory");

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write( "Hello EveryOne Good Moring Batch ");
       fileWriter.flush();
      fileWriter.close();

    System.out.println("Hello EveryOne Good Moring Batch ");
            }
}
