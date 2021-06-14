package FunctionGeneric;

public class Test {
    public static void main(String[] args) {
        Method m1 = new Method();
        m1.showDateType(11);
        m1.showDateType(true);
        m1.showDateType("65165");
        m1.showDateType(5.02);
        System.out.println("----------");

        Method.show(true);
    }
}
