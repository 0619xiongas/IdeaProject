package GenericInterface;

/**
 * 含有泛性的接口，第一种使用方式：定义接口的，指定接口的泛型
 * 2：接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
 * 自己定义的泛型I 在传入参数的时候，可以定义任意类型的参数
 */
public class Test {
    public static void main(String[] args) {
        GenericInterfaceimp1 g = new GenericInterfaceimp1();
        g.method("sfsfasdf");
        GenericInterfaceimp2<Integer> g2 = new GenericInterfaceimp2();
        g2.method(2323);
        GenericInterfaceimp2<String> g1 = new GenericInterfaceimp2<String>();
        g1.method("fsdfsasdfs");
    }
}
