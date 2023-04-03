import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException {
        File file = new File("New file Aayush");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Lekhna milyo?");
        fileWriter.close();
        FileReader fileReader= new FileReader(file);
        int character= fileReader.read();
        while(character != -1){
            System.out.print((char)character);
            character = fileReader.read();
        }
    }
}