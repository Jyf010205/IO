package Steam.Buffered;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/15 22:58
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        byte[] bytes = new byte[1024];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(byteArrayInputStream);
    }
}
