package ReaderWriter.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/16 12:51
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try {
            File file = new File("outputStreamReader.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append("陈");
            fileWriter.append("四");
            fileWriter.append("维");
            fileWriter.write("是猪猪");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
