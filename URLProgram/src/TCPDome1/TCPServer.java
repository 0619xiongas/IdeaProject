package TCPDome1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * TCP通信的服务端，接收客户端的请求
 *      构造方法
 *          ServerSocket(int port)
 *          成员方法 accept()
 *
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建对象
        ServerSocket serverSocket = new ServerSocket(8080);
        //使用accept方法，返回socket对象
        Socket socket = serverSocket.accept();
        //获取网络输入字节流对象
        InputStream is = socket.getInputStream();
        for(int i = 0;i<10;i++) {
            System.out.println("输入你要传输的话");
            String str1 = new Scanner(System.in).nextLine();
            //使用read方法读取客户端发送的数据
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));
            //获取网络字节输出流对象
            OutputStream os = socket.getOutputStream();
            //使用write方法回写数据
            os.write(str1.getBytes(StandardCharsets.UTF_8));
        }
        socket.close();
        serverSocket.close();
    }
}
