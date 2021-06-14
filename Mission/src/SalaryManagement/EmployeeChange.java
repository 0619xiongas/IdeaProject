package SalaryManagement;

/**
 * 该类为职工人员变动的工资管理类
 */
public class EmployeeChange {
    private String employeeId;

    private int  month;

    private double reward;

    private double salary;

    private double fine;

    public EmployeeChange(String employeeId, int month, double reward, double salary, double fine) {
        this.employeeId = employeeId;
        this.month = month;
        this.reward = reward;
        this.salary = salary;
        this.fine = fine;
    }

    public EmployeeChange() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }
}
