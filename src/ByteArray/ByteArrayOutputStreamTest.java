package ByteArray;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author: jianyufeng
 * @description: ByteArrayOutputStreamTest练习
 * @date: 2020/5/15 16:42
 */
public class ByteArrayOutputStreamTest {
    public static void main(String[] args) throws IOException {
//        write1();
//        write2();
//        writeTo();
        reset();
    }

    private static void write1() {
        int a = 0;
        int b = 1;
        int c = 2;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(a);
        baos.write(b);
        baos.write(c);
        byte[] bytes = baos.toByteArray();
        for (byte aByte : bytes) {
            System.out.print(aByte + ",");
        }
    }

    private static void write2() {
        byte[] buf = new byte[] { 2, 15, 67, -1, -9, 9 };
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(buf,1,4);
        byte[] bytes = baos.toByteArray();
        for (byte aByte : bytes) {
            System.out.print(aByte + ",");
        }
    }

    private static void writeTo() throws IOException {
        byte[] buf = new byte[] { 2, 15, 67, -1, -9, 9 };
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(buf);
        buf = baos.toByteArray();
        for (byte value : buf) {
            System.out.print(value + ",");
        }
        System.out.println("\n***************");
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        baos.writeTo(baos2);
        buf = baos2.toByteArray();
        for (byte b : buf) {
            System.out.print(b + ",");
        }
    }


    private static void reset() throws IOException {
        byte[] buf = new byte[] { 2, 15, 67, -1, -9, 9 };
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(buf);
        buf = baos.toByteArray();
        for (byte b : buf) {
            System.out.print(b + ",");
        }
        System.out.println("\n*************");
        baos.reset();
        buf = baos.toByteArray();
        System.out.println(buf.length);
    }
}
