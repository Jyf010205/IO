package ByteArray;

import java.io.ByteArrayInputStream;

/**
 * @author: jianyufeng
 * @description: ByteArrayInputStream练习
 * @date: 2020/5/15 16:27
 */
public class ByteArrayInputStreamTest {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{2, 15, 67, -1, -9, 9};
        read(bytes);
//        skip(bytes);
//        available(bytes);
    }

    private static void read(byte[] bytes)  {
        ByteArrayInputStream bais1 = new ByteArrayInputStream(bytes ,1 ,4);
        int b ;
        while ((b = bais1.read()) != -1){
            System.out.print(b + ",");
        }
        System.out.println("\n***********************");
        bais1 = new ByteArrayInputStream(bytes);
        while ((b = bais1.read()) != -1){
            System.out.print(b + ",");
        }
    }

    private static void skip(byte[] bytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        bais.skip(2);
        int b ;
        while ((b = bais.read()) != -1){
            System.out.print(b + ",");
        }
    }

    private static void available(byte[] bytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        bais.read();
        while (bais.read() != -1) {
            System.out.print(bais.available() + "，");
        }
    }
}
