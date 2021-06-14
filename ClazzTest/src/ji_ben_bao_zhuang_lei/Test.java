package ji_ben_bao_zhuang_lei;

/*基本的包装类

*  byte -> Byte
*  short -> Short
*   int -> Integer
*   long -> Long
*   char -> Character
*   float -> Float
*   double -> Double
*    boolean -> Boolean
*    成员方法
         static 基本型 parseXxx(String)  将字符串类型的数据转换成对应类型的数据   但是Character类中是没有parse方法的
* */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer i1 = new Integer(30); //把基本类型数据转换成对应的包装类型
        a = i1.intValue();//把包装类型转换成基本类型
        System.out.println(i1+"   "+a);

        Integer i2 = 40;
        int b = i2;
        System.out.println(i2+" "+b);

        //parseXxx方法
        String s = "995";
        int num = Integer.parseInt(s);
        int num2 = Integer.parseInt(s,16);
        //System.out.println(num);
        System.out.println(num2);
    }
}
