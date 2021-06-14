package SalaryManagement;

/**
 * 该类是职员的基础信息
 */
public class Employee {
    private String id;

    private String name;

    private String sex;

    private String startDate;

    private Salary salary;    //工资等级分为四种 甲乙丙丁。

    public Employee(String id, String name, String sex, String startDate, Salary salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.startDate = startDate;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    
}
