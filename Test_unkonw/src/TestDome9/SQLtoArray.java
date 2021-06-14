package TestDome9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.sql.*;

public class SQLtoArray {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection coon = DriverManager.getConnection("jdbc:mysql:///myemployees","root","450302");
        String str = "select * from employees";
        Statement stmt = coon.createStatement();

        ResultSet rs = stmt.executeQuery(str);
        BufferedReader reader = null;
        BufferedWriter writer = new BufferedWriter(new FileWriter("libs/source/22.txt"));
    }
}
