package GenericInterface;

public class GenericInterfaceimp2<I> implements GenericInterface<I>{

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
