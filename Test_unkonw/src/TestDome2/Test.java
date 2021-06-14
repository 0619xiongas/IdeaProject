package TestDome2;

public class Test {
    public static void main(String[] args) {
        Ostrich os = new Ostrich();
        os.fly();
        boolean b1 = os instanceof Object;
        System.out.println(b1);
        System.out.println("------------------------");
        Object hello = "hello";
        System.out.println(hello instanceof Math);
        System.out.println(hello instanceof String);
        System.out.println(hello instanceof Comparable);
    }
}
