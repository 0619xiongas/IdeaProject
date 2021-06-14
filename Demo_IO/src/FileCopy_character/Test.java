package FileCopy_character;


/*
   文件拷贝，将文件1.txt拷贝到2.txt文本中
   6步： 1，创建字符流输入对象，
        2，创建字符输出流对象，关联目的文件
        3，定义变量，记录读取到的内容
        4，循环读取，只要条件满足就一直读取，并将读取到的内容赋值给变量
        5，将读取到数据写入到目的文件中。
        6，释放资源
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("lib/1.txt");
        FileWriter fw = new FileWriter("lib/3.txt");//当目的地文件不存在的时候，会自动创建文件
        int len = 0;
        while( (len = fr.read()) != -1){
            fw.write(len);
            System.out.println(len);
        }
        fr.close();
        fw.close();
    }
}
