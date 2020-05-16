package ReaderWriter.ReaderWriter;

import java.io.*;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/16 11:14
 */
public class inputSteamReaderTest {
    public static void main(String[] args) {
        try {
            File file = new File("inputStreamReader.txt");
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
            System.out.println("ready() " + reader.ready());
            System.out.println("getEncoding() " + reader.getEncoding());
            System.out.println("read() " + (char)reader.read());
            char[] chars = new char[40];
            reader.read(chars);
            System.out.println("read()other" + new String(chars));
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
