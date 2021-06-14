package Reader_Writer;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
通过字符流读取数据
  Reader类中的方法  ：int read();   读一个字符，返回该字符的ASCII码值 读不到返回-1；
  int read(char[] chs) : 一次读一个字符到数组，把内容存放到数组中，

  FileReader类的构造方法：
     public FileReader(String pathname)  根据传入的字符串形式的路径，获取字符输入流对象
 */
public class Reader_test {
    public static void main(String[] args)throws IOException {
        //1 创建字符输入流对象
        Reader reader = new FileReader("lib/1.txt");

        //2 读取数据
/*        int ch ;
        while((ch = reader.read()) != -1){
            System.out.println(ch);
        }*/
        char[] chs = new char[3];
        int len1 = 0;
        while((len1 = reader.read(chs)) != -1){
            String str = new String(chs);
            System.out.println(str);
        }
        
        //3 释放资源
        reader.close();
    }
}
