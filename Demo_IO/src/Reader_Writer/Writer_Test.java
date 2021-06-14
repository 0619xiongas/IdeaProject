package Reader_Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*通过字符流写入数据
     Writer类中的方法：
        void write(int ch)  :一次写一个字符
        void write(char [],int index,int len) ：字符数组
        void write(Strig str) 字符串

     构造方法：
     public FileWriter(String pathname)

 */
public class Writer_Test {
    public static void main(String[] args)throws IOException {
        Writer writer = new FileWriter("lib/1.txt");
       // writer.write("唐雄");

        /*char[] chs = {'波','本','可','乐'};
        writer.write(chs,1,3);*/

        writer.write("好好学习啊");
        writer.close();
    }
}
