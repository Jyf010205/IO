package Steam.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/15 23:30
 */
public class FileinputStreamTest {
    private static final String FileName = "fileStream.txt";

    public static void main(String[] args) {
        try {
            File file = new File(FileName);
            FileInputStream fis = new FileInputStream(file);
            System.out.println("使用read()读取一个字节：" + (char) fis.read());
            System.out.println("使用available()获取当前可用字节数:" + fis.available());

            // 测试read(byte[] b,int off,int len)
            byte[] b = new byte[5];
            fis.read(b, 0, b.length);
            System.out.println("使用readread(byte[] b,int off,int len)读取5个字节到b中:" + new String(b));

            System.out.println("使用available()获取当前可用字节数:" + fis.available());

            // 测试skip(long byteCount)
            System.out.printf("使用skip(long n)跳过%s个字节\n", fis.skip(1));

            System.out.println("使用available()获取当前可用字节数:" + fis.available());
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
