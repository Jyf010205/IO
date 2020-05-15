# IO
IO的操作Demo

# ByteArrayInputStream
1.字节输入流必须提供返回下一个输入字节的read()方法。因为所有字节输入流的父类InputStream有这样一个抽象方法：public abstract int read()。  
2.ByteArrayInputStream 支持 mark/reset。  
3.ByteArrayInputStream的close方法无效，无法关闭此输入流。

# ByteArrayOutputStream
1.ByteArrayOutputStream中的数据被写入到一个byte数组里。byte数组会随着被写入其中的数据的增长而增长。  
2.表示字节输出流的类必须提供至少一种可写入一个输出字节的方法。ByteArrayOutputStream提供了两种。  
3.ByteArrayOutputStream可以将缓冲区中的数据转化为byte数组或字符串并返回。  
4.ByteArrayOutputStream可以通过writeTo( OutputStream out)实现输出流之间数据的复制  
5.ByteArrayOutputStream的close方法无效，无法关闭此输出流。  

# PipedInputStream与PipedOutputStream
1.PipedInputStream与PipedOutputStream分别为管道输入流和管道输出流。管道输入流通过连接到管道输出流实现了类似管道的功能，用于线程之间的通信。  
2.通常，由某个线程向管道输出流中写入数据。根据管道的特性，这些数据会自动发送到与管道输出流对应的管道输入流中。这时其他线程就可以从管道输入流中读取数据，这样就实现了线程之间的通信。  
3.不建议对这两个流对象尝试使用单个线程，因为这样可能死锁线程。  
4.PipedOutputStream是数据的发送者；PipedInputStream是数据的接收者。  
5.PipedInputStream缓冲区大小默认为1024，写入数据时写入到这个缓冲区的，读取数据也是从这个缓冲区中读取的。  
6.PipedInputStream通过read方法读取数据。PipedInputStream通过write方法写入数据，write方法其实是调用PipedInputStream中的receive方法来实现将数据写入缓冲区的的，因为缓冲区是在PipedInputStream中的。  
7.PipedOutputStream和PipedInputStream之间通过connect()方法连接。  
