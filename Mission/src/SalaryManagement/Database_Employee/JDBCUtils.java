package SalaryManagement.Database_Employee;


import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            InputStream is = classLoader.getResourceAsStream("db1.properties");
            Properties p = new Properties();
            p.load(is);
            driver = p.getProperty("driver");
            url = p.getProperty("url");
            username = p.getProperty("username");
            password = p.getProperty("password");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * 获取连接数据库的方法
     * @return
     */
    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }


    public static void freed(Connection connection, PreparedStatement stat, ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(stat != null){
            try{
                stat.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
