package Date_Calendar;

import java.util.Calendar;
import java.util.Date;

/*Date
    空参构造，就是获取当前系统时间
    带参构造就是自己创建一个时间
    成员方法，long  getTime(); 将时间转换成对应的毫秒值

Calendar

* */
public class test {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(1611826297995L);
        System.out.println(date1+"         "+date2);
        long time = date1.getTime();
        System.out.println(time);

        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1);//打印当前时间的所有内容


        //获取年月日的信息
        int year = calendar1.get(Calendar.YEAR);
        int month = calendar1.get(Calendar.MONTH);//0~11表示月份
        int day = calendar1.get(Calendar.DATE);
        System.out.println(year + "年" +(month + 1)+ "月"+day+"日");

        //设置指定时间
        calendar1.set(2020,1,2);
        int year2 = calendar1.get(Calendar.YEAR);
        int month2= calendar1.get(Calendar.MONTH);
        int day2 = calendar1.get(Calendar.DATE);
        System.out.println(year2 + "年" +(month2 + 1)+ "月"+day2+"日");
    }
}
