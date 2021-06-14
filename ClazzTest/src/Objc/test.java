package Objc;

public class test {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());

        String str1 = obj1.toString();
        String str2 = obj2.toString();

        //默认打印的是地址值
        //地址值的组成 ： 全类名 + @ + 哈希码值的十六进制值
        System.out.println(str1);
        System.out.println(str2);

        //equals 方法默认比较的是地址值
        System.out.println(str1.equals(str2));

        String s1 = "1111";
        String s2 = "1111";

        System.out.println(s1.equals(s2));
    }
}
/*
class Person extends Object{

}

class  Student extends  Person{

}*/
