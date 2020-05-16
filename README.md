# IO
IO的操作Demo

#InputStream read()从输入流中读取数据的下个字节。
ByteArrayInputStream	包含一个内部缓冲区，该缓冲区包含从流中读取的字节。	  
PipedInputStream	和PipedOutputStream一起使用，实现多线程间的管道通信。	  
FilterInputStream	FilterInputStream主要用途在于封装其他的输入输出流，为它们提供一些额外的功能。FilterInputStream的子类可进一步重写一些方法，并且还可以提供一些额外的方法和字段。	  
BufferedInputStream	用于为其他输入流提供缓冲功能。	  
DataInputStream	用来装饰其它输入流，以从底层输入流中读取基本Java数据类型。	  
FileInputStream	文件输入流，用于从文件系统中的某个文件中获得输入字节。FileInputStream用于读取诸如图像数据之类的原始字节流。要读取字符流，请考虑使用FileReader。	  
ObjectInputStream	对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化。	  

#OutputStream write()将指定的字节写入此输出流。
ByteArrayOutputStream	ByteArrayOutputStream中数据被写入一个byte数组。缓冲区会随着数据的不断写入而自动增长。	  
PipedOutputStream	和PipedInputStream一起使用，实现多线程间的管道通信。	  
FilterOutputStream	FilterOutputStream主要用途在于封装其他的输入输出流，为它们提供一些额外的功能。FilterOutputStream的子类可进一步重写一些方法，并且还可以提供一些额外的方法和字段。  
BufferedOutputStream	用于为其他输出流提供缓冲功能。	  
DataOutputStream	数据输出流允许应用程序以适当方式将基本Java数据类型写入输出流中。	  
PrintStream	为其他输出流提供打印功能。	  
FileOutputStream	文件输出流，用于将数据写入File或FileDescriptor的输出流。FileOutputStream用于写入诸如图像数据之类的原始字节的流。要写入字符流，请考虑使用FileWriter。	  
ObjectOutputStream	将Java对象的基本数据类型和图形写入。  

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

#FileInputStream与FileOutputStream
1.FileInputStream是文件输入流，用于从文件系统中的某个文件中获得输入字节。FileInputStream用于读取诸如图像数据之类的原始字节流。要读取字符流，请考虑使用FileReader。  
2.FileOutputStream是文件输出流，用于将数据写入File或FileDescriptor的输出流。FileOutputStream用于写入诸如图像数据之类的原始字节的流。要写入字符流，请考虑使用FileWriter。  
3.Java语言本身不能对操作系统底层进行访问和操作，但是可以通过JNI接口调用其他语言来实现对底层的访问。open0方法  

#BufferedInputStream与BufferedOutputStream
1.BufferedInputStream是缓冲输入流，作用是为另一个输入流添加一些功能，比如缓冲输入功能以及支持mark和reset方法的能力。  
2.BufferedOutputStream是缓冲输出流，通过设置这种输出流，应用程序就可以将各个字节写入底层输出流中，而不必针对每次字节写入调用底层系统。  

#Reader
CharArrayReader	用于读取字符数组，实现一个可用作字符输入流的字符缓冲区。	  
PipedReader	和PipedWriter一起实现线程间的通讯。	  
FilterReader	用于读取已过滤的字符流	  
BufferedReader	为另一个输入流添加缓冲功能。	  
InputStreamReader	是字节流通向字符流的桥梁	  
FileReader	用于对文件进行读取操作  

#writer
CharArrayWriter	实现了一个字符缓冲区。缓冲区会随向流中写入数据而自动增长。	  
PipedWriter	和PipedReader一起是通过管道实现线程间的通讯。	  
FilterWriter	用于写入已过滤的字符流。	  
BufferedWriter	为另一个输出流添加缓冲功能。	  
OutputStreamWriter	是字符流通向字节流的桥梁，	  
FileWriter	用于对文件进行写入操作。	  
PrintWriter	为文本输出流提供打印功能。  

#CharArrayReader
1.CharArrayReader实现一个可用作字符输入流的字符缓冲区。  
2.在做所有操作前，都要确认流处于open状态。判断流处于open状态的依据是buf不为null。close方法中会将buf置为null。  
3.CharArrayReader支持mark()操作。  

#CharArrayWriter
1.CharArrayWriter实现一个可用作字符输出流的字符缓冲区。  
2.CharArrayWriter的缓冲区会随向流中写入数据而自动增长。  
3.可使用CharArrayWritert的oCharArray()和 toString()获取缓冲区中数据。  
4.CharArrayWriter中close()方法无效。  

#InputStreamReader与OutputStreamWriter
1.InputStreamReader，字节流通向字符流的桥梁：它使用指定的charset读取字节并将其解码为字符。  
2.每次调用InputStreamReader中的read方法都会导致从底层输入流读取一个或多个字节，然后调用编码转换器将字节转化为字符。为避免频繁调用转换器，实现从字节到字符的高效转换，可以提前从底层流读取更多的字节。为了达到最高效率，可要考虑在BufferedReader内包装InputStreamReader。  
3.InputStreamReader的功能是依赖于StreamDecoder完成的。  
4.OutputStreamWriter，字符流通向字节流的桥梁：它使用指定的charset将要写入流中的字符编码成字节。  
5.每次调用write()方法都会导致在给定字符（或字符集）上调用编码转换器。为避免频繁调用转换器，在写入底层输出流之前，可以将得到的这些字节积累在缓冲区。例如，可考虑将OutputStreamWriter包装到BufferedWriter中。  

#FileReader与FileWriter
1.FileReader是用于读取字符流的类。  

此类的构造方法假定默认字符编码和默认字节缓冲区大小都是可接受的。要自己指定这些值，可以先在FileInputStream上构造一个InputStreamReader。要读取原始字节流，请考虑使用FileInputStream。  
在使用时一般使用BufferedReader来包装此类。  
2.FileWriter是用于写入字符流的类。  

此类的构造方法假定默认字符编码和默认字节缓冲区大小都是可接受的。要自己指定这些值，可以先在FileOutputStream上构造一个OutputStreamWriter。要写入原始字节流，请考虑使用FileOutputStream。  
在使用时一般使用BufferedWriter来包装此类。  