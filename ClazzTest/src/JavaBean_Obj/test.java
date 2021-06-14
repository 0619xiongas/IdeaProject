package JavaBean_Obj;

public class test {
    public static void main(String[] args) {
        //测试tostring方法
        Student stu1 = new Student(1,"张三",96);
        //输出语句直接打印对象，就是默认使用了toString方法.
        System.out.println(stu1);
        //即使Student类中没有重写toString方法,但是，所有的类都是Object的子类，所以可以直接
        //直接使用该方法
        System.out.println(stu1.toString());

        //测试equals方法
        Student s2 = new Student(1,"张三",96);
        System.out.println(stu1.equals(s2));
    }
}
