package ReaderWriter.ReaderWriter;

import java.io.*;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/16 11:21
 */
public class outputSteamReaderTest {
    public static void main(String[] args) {
        try {
            File file = new File("outputStreamReader.txt");
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file),"GBK");
            writer.write("陈四维是猪");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
