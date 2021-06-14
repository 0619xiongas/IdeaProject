package FileCopy_character;


import java.io.*;

/*
通过字符缓冲流一次读取一行的方式拷贝文件
    BufferedReader 中的成员方法 ： public String readLine()

    BufferedWriter 中的成员方法： public void newLine()

    字符流只能拷贝纯文本文件，即txt文件

 */
public class Test3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lib/1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/2.txt"));

        String str ;
        while((str = br.readLine()) != null){
            bw.write(str);
            bw.newLine();//换行
        }
        br.close();
        bw.close();
    }
}
