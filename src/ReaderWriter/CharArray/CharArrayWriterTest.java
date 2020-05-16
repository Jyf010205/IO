package ReaderWriter.CharArray;

import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/16 10:37
 */
public class CharArrayWriterTest {
    private static final char[] charArr = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g'};

    public static void main(String[] args) {
        try {
            CharArrayWriter writer1 = new CharArrayWriter();
            writer1.write("A");
            writer1.write("BCDEF");
            writer1.write(charArr,1,3);
            System.out.println(writer1);

            writer1.append('0').append("12345").append(String.valueOf(charArr));
            System.out.println(writer1);

            char[] chars = writer1.toCharArray();
            System.out.println(chars);

            CharArrayWriter writer2 = new CharArrayWriter(100);
            writer1.writeTo(writer2);
            System.out.println(writer2);

            writer1.reset();
            System.out.println("重置后" + writer1.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
