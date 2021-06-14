package dome2;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");

    }

    @Override
    public void sleep() {
        System.out.println("猫躺着睡");
    }
}
