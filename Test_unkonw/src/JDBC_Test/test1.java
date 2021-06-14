package JDBC_Test;

/*URL基本写法:  jdbc:mysql://ip地址(域名):端口号(一般是3306)/数据库名称
如果连接的是本机mysql服务器，则可以简写为    jdbc:mysql:///数据库名称
* */
import java.sql.*;

public class test1 {
    public static void main(String[] args) throws Exception{
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取数据库连接对象
        Connection coon = DriverManager.getConnection("jdbc:mysql:///example","root","450302");
        //Connection coon = DriverManager.getConnection("jdbc:mysql://localhost:3306/example","root","450302");
        String sql = "select * from example";

        Statement stmt = coon.createStatement();

        ResultSet re = stmt.executeQuery(sql);
        while(re.next()){
            System.out.println("id: "+re.getInt("id") + " name: "+re.getString("name") +
                    " sec: "+re.getInt("sec"));
        }
        stmt.close();
        coon.close();
        re.close();
    }
}
