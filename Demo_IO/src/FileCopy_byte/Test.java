package FileCopy_byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
   字节流拷贝文件：
       FileInputStream构造方法 ：public FileInputStream(String pathname)

          成员方法 ： public int read();

       FileOutputStream 构造方法 ：public FileOutputStream(String pathname)

         成员方法 ： public void write(int len)
 */
public class Test {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("lib/1.jpg");
        FileOutputStream fos = new FileOutputStream("lib/b.jpg");

        int len;
        byte[] bys = new byte [2048];
/*        while((len = fis.read()) != -1){
            fos.write(len);
        }*/
        while((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }
}

/*
高效的BufferedInputStream 跟BufferedOutputStream 的操作跟前面字符流输出的操作一致
 */