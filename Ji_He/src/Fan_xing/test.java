package Fan_xing;

//泛型的集合，指定集合中的数据的类型

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("ab");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(123);

        for (Object o:list) {
            //String s = (String) o;
            System.out.println(o);
        }
        List<String> list1 = new ArrayList<>();
        list1.add("sdf");
        list1.add("ff");
        list1.add("sfdf");
        list1.add("k;l");
        for(String o:list1){
            System.out.println(o);
        }
    }
}
