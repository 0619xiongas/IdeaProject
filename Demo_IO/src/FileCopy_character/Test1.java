package FileCopy_character;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    一次读取一个字符数组
 */
public class Test1 {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("lib/1.txt");
        FileWriter fw = new FileWriter("lib/2.txt");

        char[] chs = new char[2048];
        int len;
        while((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
            System.out.println(len);
        }
        fr.close();
        fw.close();
    }
}
