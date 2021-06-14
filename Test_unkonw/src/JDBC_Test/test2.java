package JDBC_Test;

import java.sql.*;

/*
   example 表添加一条记录
   example 表修改一条记录
   example 表删除一条记录
* */
public class test2 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            // 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //定义sal语句
            String sql1 = "insert into example values(11,'小刚',98)";
            String sql2 = "update example set sec = 94 where name = '唐雄'";
            String sql3 = "delete from example where name = 'tx'";
            //获取对象
            conn = DriverManager.getConnection("jdbc:mysql:///example", "root", "450302");
            //获取执行sql的对象Statement
            stmt = conn.createStatement();
            //执行sql语句
            int count = stmt.executeUpdate(sql3);
            //处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("打印成功");
            } else System.out.println("打印失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
