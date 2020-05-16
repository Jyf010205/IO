package Steam.Piped;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author: jianyufeng
 * @description: 接收者线程，信息的接收者。将信息从管道输入流中读取出来
 * @date: 2020/5/15 17:20
 */
public class Receiver extends Thread{
    private PipedInputStream in = new PipedInputStream();

    public PipedInputStream getInputStream(){
        return in;
    }

    @Override
    public void run() {
        readMessage();
    }

    //从管道输入流中读取数据
    private void readMessage() {
        //PipedInputStream缓冲区大小默认为1024，写入数据时写入到这个缓冲区的，读取数据也是从这个缓冲区中读取的。
        byte[] buf = new byte[1024];
        try {
            //从缓冲区中读取数据到buf中
            in.read(buf);
            //打印读取到的内容
            System.out.println(new String(buf));
            //释放资源
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
