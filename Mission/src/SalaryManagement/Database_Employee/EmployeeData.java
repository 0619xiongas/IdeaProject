package SalaryManagement.Database_Employee;

import SalaryManagement.Employee;
import SalaryManagement.EmployeeChange;
import SalaryManagement.Salary;

import java.sql.*;
/**
 * 改类为对employees表的操作,增删改查
 *   第一个表中字段有：
 *           id :员工编号   String
 *           name ：员工名字
 *           sex ：员工性别
 *           startDate ：开始工作的时间   String
 *           salaryLel: 工资等级        double
 *           basicSalary 基本工资
 *           jobSalary 岗位工资
 *           trafficSalary 交通补贴
 *           reward： 奖励
 *           fine ： 罚款
 *           salary ： 最终工资
 */
public class EmployeeData {
    /**
     *  添加用户信息。
     * @param employee
     * @param ec
     * @return
     */
    public static boolean addUser(Employee employee, EmployeeChange ec){
        PreparedStatement ps = null;
        Connection conn = null;
        String sql = "insert into employees(id,name,sex,startDate,salaryLel,basicSalary,jobSalary,trafficSalary,reward,fine,salary) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            //sql语句预处理，将数据放入sql语句中的？中.
            ps.setString(1, employee.getId());
            ps.setString(2,employee.getName());
            ps.setString(3,employee.getSex());
            ps.setString(4, employee.getStartDate());
            ps.setString(5,employee.getSalary().getSalaryLel());
            ps.setDouble(6,employee.getSalary().getBasicSalary());
            ps.setDouble(7,employee.getSalary().getJobSalary());
            ps.setDouble(8,employee.getSalary().getTrafficSubsidy());
            ps.setDouble(9,ec.getFine());
            ps.setDouble(10,ec.getFine());
            ps.setDouble(11,ec.getSalary());
            int count = ps.executeUpdate();
            if(count >0){
                return true;
            }else{
                return false;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.freed(conn,ps,null);
        }
        return false;
    }

    /**
     *
     * @param id        id为primary key，用此字段去进行约束
     * @param preData   要修改的数据的字段名
     * @param afterData  修改的数据
     * @return
     */
    public static boolean updateUser_S(String id,String preData,String afterData){
        PreparedStatement ps = null;
        Connection conn = null;
        String sql = "update employees set "+preData+"=? where id=?";
        try{
            conn=JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,afterData);
            ps.setString(2,id);
            int count = ps.executeUpdate();
            if(count >0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.freed(conn,ps,null);
        }
        return false;
    }

    /**
     *
     * @param id
     * @param preData    字段名都是String类
     * @param afterData   double类型数据
     * @return
     */
    public static boolean updateUser_D(String id,String preData,Double afterData){
        PreparedStatement ps = null;
        Connection conn = null;
        String sql = "update employees set "+preData+"=? where id=?";
        try{
            conn=JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setDouble(1,afterData);
            ps.setString(2,id);
            int count = ps.executeUpdate();
            if(count >0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.freed(conn,ps,null);
        }
        return false;
    }

    /**
     * 删除一条数据，即删除一个员工的信息
     * @param id   id为唯一的标识，
     * @return
     */
    public static boolean subUser(String id){
        PreparedStatement ps = null;
        Connection conn  = null;
        String sql = "delete from employees where id = ?";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,id);
            int count = ps.executeUpdate();
            if(count >0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.freed(conn,ps,null);
        }
        return false;
    }
    public static Employee getUser(String id){
        Employee em = null;
        Salary salary = null;
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet res = null;
        String sql = "select * from employees where id=?";
        try{
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,id);
            res = ps.executeQuery();
            em.setId(res.getString("id"));
            em.setName(res.getString("name"));
            em.setSex(res.getString("sex"));
            em.setStartDate(res.getString("startDate"));
            salary.setSalaryLel(res.getString("salaryLel"));
            salary.setBasicSalary(res.getDouble("basicSalary"));
            salary.setJobSalary(res.getDouble("jobSalary"));
            salary.setTrafficSubsidy(res.getDouble("trafficSalary"));

            em.setSalary(salary);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.freed(conn,ps,res);
        }
    }
}
