package ReaderWriter.CharArray;

import java.io.CharArrayReader;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/16 10:27
 */
public class CharArrayReaderTest {
    public static void main(String[] args) {
        try {
            CharArrayReader reader =
                    new CharArrayReader(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'});
            //从read中连续读取三个字节
            for (int i = 0; i < 3; i++){
                if (reader.ready()){
                    char word = (char) reader.read();
                    System.out.print(word);
                }
            }
            System.out.println();

            //测试是否支持mark
            if (!(reader.markSupported())){
                System.out.println("mark不支持");
                return;
            }else {
                System.out.println("mark支持");
            }

            //标记
            reader.mark(0);
            //跳过两个字符,
            reader.skip(2);

            //向下读取两个字符 fg
            char[] buf = new char[2];
            reader.read(buf, 0, 2);
            System.out.println("buf:" + String.valueOf(buf));

            // 重置当前位置为上一次标记的位置，即为d
            reader.reset();
            //向下读取两个字符 de
            reader.read(buf, 0, 2);
            System.out.println("buf:" + String.valueOf(buf));

            reader.close();
        }catch (Exception e){

        }
    }
}
