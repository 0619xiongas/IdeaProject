package TestDome9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLallLine {
    public static void main(String[] args)  {
        fun("1");
    }
    public static  void fun(String sql){
        Statement stmt = null;
        Connection coon = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            coon = DriverManager.getConnection("jdbc:mysql:///example", "root", "450302");
            stmt = coon.createStatement();
            ResultSet re = stmt.getResultSet();
            System.out.println(re.getString("id"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}