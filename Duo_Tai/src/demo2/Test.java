package demo2;



/*
    已知有父类Animal，成员变量为姓名，成员方法为eat方法
    他有两个子类Dog跟Mouse类，两个子类都重写了Animal中的eat方法
    在测试类中定义showAnimal方法，用来测试Dog跟Mouse类
 */

//多态成员方法中，编译看左，运行看右
public class Test {
    public static void main(String[] args) {

        //传统的做法
        Dog dog = new Dog();
        dog.setName("哈士奇");
        showAnimal(dog);

        Mouse mouse = new Mouse();
        mouse.setName("杰瑞");
        showAnimal(mouse);
    }

    //多态类型
    public static void showAnimal(Animal animal) {
        animal.eat();
        System.out.println("ok!");
    }

    //传统类型
    public static void showAnimal(Dog d) {
        d.eat();
    }

    public static void showAnimal(Mouse m) {
        m.eat();
    }

}
