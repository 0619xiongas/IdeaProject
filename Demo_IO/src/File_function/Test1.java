package File_function;

import java.io.File;

/*
  成员方法
      getAbsolutePath  : 获取绝对路径(带那个盘)
      getPath : 获取相对路径
      getName :  获取文件名
      list():   获取目录下文件名称数组
      listFiles():   获取目录下文件File数组
 */
public class Test1 {
    public static void main(String[] args) {
        File f1 = new File("lib/1.txt");
        //获取路径
        System.out.println("绝对路径："+f1.getAbsolutePath());
        System.out.println("相对路径："+f1.getPath());
        //获取文件名
        System.out.println("文件名："+f1.getName());
        System.out.println("-------------------------------------");

        //获取lib文件下的所有文件名的名称数组: 只能拿到lib目标文件的下一级目录
        File f2 = new File("lib");
        String[] names = f2.list();
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("-------------------------------------");
        //获取file对象数组，拿到的是file类型的数据
        File[] files = f2.listFiles();
        for(File file:files){
            System.out.println(file);
        }
    }
}
