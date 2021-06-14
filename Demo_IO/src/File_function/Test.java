package File_function;

/*
  File 类：
     构造方法：
     File(String pathname)    根据给定的字符串路径创建其对应的file对象
     File(String parent,String child)    根据给定的字符串形式的父目录和子文件名创建file对象
     File(File parent,String chile)     根据给定的父目录对象和子文件名创建file对象

     成员方法：
       创建功能：  如果不存在就创建，返回true否则返回false，不创建
          createNewFile():  创建文件
          mkdir():   创建单级目录
          mkdirs():  创建目录

       判断功能：
          isDirectory()  :判断File对象是否为目录
          isFile():   判断File对象是否为文件
          exists():   判断File对象是否存在
 */

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //将F：\IO_Test\1.txt 封装成对象
        //方法1：
        File f1 = new File("F:/IO_Test/1.txt");
        System.out.println(f1);
       //方法2
        File f2 = new File("F:/IO_Test","1.txt");
        System.out.println(f2);
        // 方法3
        File f3 = new File("F:/IO_Test");
        File f4 = new File(f3,"1.txt");
        System.out.println(f4);

        //在F盘创建一个2.txt文件
        File f5 = new File("f:/2.txt");
        boolean b1 = f5.createNewFile();
        System.out.println(b1);

        File f6 = new File("f:/aaaa");
        boolean b2 = f6.mkdir();
        System.out.println(b2);

        File f7 = new File("f:/aaa/b/c");
        boolean b3 = f7.mkdirs();//单级目录跟多级目录都可以
        System.out.println(b3);

        File f8 = new File("f:/IO_Test/1.txt");
        System.out.println("f8是否为文件"+f8.isFile());
        System.out.println("f8是否存在"+f8.exists());
        System.out.println("f8是否为文件夹"+f8.isDirectory());


    }
}
