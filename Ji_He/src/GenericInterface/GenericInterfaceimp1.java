package GenericInterface;

public class GenericInterfaceimp1 implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
