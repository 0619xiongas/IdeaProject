package FileCopy_character;


import java.io.*;

/*
字符流读取文件拷贝文件
   使用BufferedReader 跟 BufferedWriter
      BufferedReader构造方法：  public BufferedReader(Reader reader)
      BufferedWriter构造方法：  public BufferedWriter(Writer writer)

      缓冲区 8192个字符，16kb
 */
public class Test2 {
    public static void main(String[] args)throws IOException {
        Reader reader = new FileReader("lib/1.txt");
        BufferedReader br = new BufferedReader(reader);
       // BufferedReader br2 = new BufferedReader(new FileReader("lib/1.txt"));简化代码

        Writer writer= new FileWriter("lib/2.txt");
        BufferedWriter bw = new BufferedWriter(writer);
       // BufferedWriter bw2 = new BufferedWriter(new FileWriter("lib/2.txt"));简化代码

        int len ;
        while((len = br.read()) != -1){//底层是按照字符数组读写的
            bw.write(len);
        }
        br.close();
        bw.close();
    }
}
