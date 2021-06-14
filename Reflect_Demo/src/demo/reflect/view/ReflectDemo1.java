package demo.reflect.view;



/*
    获取Class对象(字节码文件对象)三种方式

       1、Object类的getClass()方法
         Class ca = 对象名.getClass();

       2、类的静态属性
         Class ca = 类名.class

       3、Class类的静态方法
          Class ca = Class.forName("类的正名");
          正名 = 包名 + 类名

      一个源文件(.java)文件是对应一个字节码文件对象(.class)
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException{

        //方法一：
        Student stu = new Student();
        Class ca = stu.getClass();

        //方法二：
        Class ca2 = Student.class;

        //方法三：
        Class ca3 = Class.forName("demo.reflect.view.Student");

        System.out.println(ca == ca2);
        System.out.println(ca2 == ca3);
    }
}
