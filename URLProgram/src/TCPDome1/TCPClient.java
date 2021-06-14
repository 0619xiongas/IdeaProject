package TCPDome1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * TCP通信的客户端
 * Socket
 * 套接字，包括了IP地址跟端口号的信息
 * 构造方法：
 * Socket(String host,int port)
 * host:ip地址
 * port：端口号
 * 成员方法：
 * getOutputStream()获取套接字的输出流
 * getInputStream() 获取套接字的输入流
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket = new Socket("172.24.2.42", 7468);
        //获取流对象 OutputStream
        OutputStream os = socket.getOutputStream();
        //使用网络字节输出流的write方法写入数据
        for(int i = 0;i<10;i++) {
            System.out.println("输入你要传输的话");
            String str1 = new Scanner(System.in).nextLine();
            os.write(str1.getBytes(StandardCharsets.UTF_8));
            //获取InputStream
            InputStream is = socket.getInputStream();
            //使用网络字节输入流的read方法，读取服务器回写的数据
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));
        }
        //释放资源
        socket.close();
    }
}
