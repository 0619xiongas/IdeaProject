package dome2;

public class test {
    public static void main(String[] args) {
        empo empo = new coder();
        empo.show();
        System.out.println("----------------");
        //基本类的final变量
        final int NUM = 20;
        System.out.println(NUM);
        System.out.println("----------------");
        //引用类型的变量
        final empo empo1 = new empo();//不能再
        empo1.name = "jack";
        empo1.age = 23;
        System.out.println("name = "+empo1.name);
        System.out.println("age = "+empo1.age);
    }
}
