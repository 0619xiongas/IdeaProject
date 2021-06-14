package TestDome9;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 从数据库中读取数据，将数据写入
 */

public class SQLtoTXT {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection coon = DriverManager.getConnection("jdbc:mysql:///myemployees","root","450302");
        String str = "select last_name from employees";
        Statement stmt = coon.createStatement();

        ResultSet rs = stmt.executeQuery(str);
        BufferedReader reader = null;
        BufferedWriter writer = new BufferedWriter(new FileWriter("libs/source/11.txt"));
        String str1;
        int i=0;
        int j=0;
        while(rs.next()){
            reader = new BufferedReader(rs.getCharacterStream(j++));
            while((str1 = reader.readLine()) != null){
                writer.write(str1);
                writer.write(" ");
                i++;
                if(i == 10) {
                    writer.newLine();
                    i = 0;
                }
            }
        }
        rs.close();
        stmt.close();
        coon.close();
        reader.close();
        writer.close();
    }
}
