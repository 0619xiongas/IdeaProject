package TestDome2;

public class Ostrich extends Bird{
    @Override
    public void fly() {
        System.out.println("在陆地奔跑");
    }
    public void show(){
        super.fly();
    }
}
