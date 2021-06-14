package TestDome2;

public class test1 {
    public static void main(String[] args) {
        Parent p1 = new Child();
        Parent p2= new Parent();
        p1.function();
        p2.function();
    }
}
  class Parent{
    public void function(){
        System.out.println("I am in Parent");
    }
}
class Child extends Parent{
    public void function(){
        System.out.println("I am in Child");
    }
}