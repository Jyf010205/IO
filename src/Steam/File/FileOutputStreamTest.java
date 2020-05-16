package Steam.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/15 23:14
 */
public class FileOutputStreamTest {
    private static final String FileName = "fileStream.txt";
    public static void main(String[] args)  {
        try {
            File file = new File(FileName);
            // 创建文件对应的FileOutputStream对象，默认是覆盖模式
            FileOutputStream fos1 = new FileOutputStream(file);
            fos1.write(new byte[]{0x61, 0x62, 0x63, 0x64});//a,b,c,d
            fos1.write(new byte[]{0x65, 0x66, 0x67, 0x68});//e,f,g,h
            // 创建文件对应的FileOutputStream对象，默认是覆盖模式
            FileOutputStream fos2 = new FileOutputStream(file);
            fos2.write(new byte[] { 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78 });// qrstuvwx
            // 创建文件对应的FileOutputStream对象，模式为追加模式
            FileOutputStream fos3 = new FileOutputStream(file, true);
            fos3.write(new byte[] { 0x51, 0x52, 0x53, 0x54 });// QRST
            fos1.close();
            fos2.close();
            fos3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
