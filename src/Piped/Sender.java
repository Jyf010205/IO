package Piped;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author: jianyufeng
 * @description: 发送者线程，信息的发送者。将信息写入管道输出流中
 * @date: 2020/5/15 17:17
 */
public class Sender extends Thread{
    private PipedOutputStream out = new PipedOutputStream();
    public PipedOutputStream getOutputStream(){
        return out;
    }

    @Override
    public void run() {
        writeMessage();
    }

    // 向管道输出流中写入信息
    private void writeMessage() {
        String string = "Hello World!";
        try {
            // 向管道输入流中写入数据
            out.write(string.getBytes());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
