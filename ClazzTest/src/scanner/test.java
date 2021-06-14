package scanner;

import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        if(sc.hasNextInt()) {//判断下一个录入的是否位int类型的数据
            int num = sc.nextInt();
            System.out.println(num);
        }*/
        Scanner sc1 = new Scanner(System.in);

        String str1 = sc1.nextLine();//结束标记是换行符，即enter键
        System.out.println(str1);

        Scanner sc2 = new Scanner(System.in);
        String str2 = sc2.next();//结束符是空白字符，Space键
        System.out.println(str2);

    }
}
