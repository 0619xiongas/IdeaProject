package Test;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        Student stu1 = new Student(20,"张三");
        Student stu2 = new Student(22,"李四");
        Student stu3 = new Student(22,"lisi");
        try{
            FileOutputStream fos = new FileOutputStream("lib/student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu1);
            oos.writeObject(stu2);
            oos.writeObject(stu3);
            System.out.println(stu1.toString());
            oos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
