package GenericWildcard;

import java.util.ArrayList;

public class GenericWildcard {
    public static void main(String[] args) {
        //普通的
        ArrayList<Integer> List01 = new ArrayList<>();
        List01.add(1);
        List01.add(2);

        ArrayList<String> List02 = new ArrayList<>();
        List02.add("trag");
        List02.add("tabghf");

        show(List01);
        show(List02);
    }
        //使用泛型的通配符
    public static void show(ArrayList<?> list){
        for (Object o:list) {
            System.out.println(o); //object类型是可以接收任意类型的数据
        }
    }
}
