package IOTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static final String PATH ="D:\\JAVA\\Module-2\\src\\Hello.txt";

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
