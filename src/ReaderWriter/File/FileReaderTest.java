package ReaderWriter.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/16 11:57
 */
public class FileReaderTest {
    public static void main(String[] args) {
        try {
            File file = new File("inputStreamReader.txt");
            FileReader reader = new FileReader(file);
            char read = (char) reader.read();
            System.out.println(read);
            char[] chars = new char[40];
            reader.read(chars);
            System.out.println(chars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
