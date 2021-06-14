package reflect.test;



import java.lang.reflect.Constructor;

public class test {
    public static void main(String[] args) throws Exception{
        // 通过反射的方式创建Student类型的对象
        Class clazz = Class.forName("reflect.test.Student");

        //获取公共的无参构造
        Constructor con1 = clazz.getConstructor();
        System.out.println(con1);

        //获取公共的带参构造
        Constructor con2 = clazz.getConstructor(String.class);
        System.out.println(con2);

        //获取私有的带参构造
        Constructor cno3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(cno3);

        //获取Student类的所有构造方法:
        System.out.println("---------------------");
        Constructor[] cons = clazz.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
    }
}
