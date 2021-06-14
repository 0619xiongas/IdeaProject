package SalaryManagement;

/**
 * 该类为公职人员的薪水等级情况管理类
 */
public class Salary {
    private String salaryLel;

    private double basicSalary;

    private double jobSalary;

    private double trafficSubsidy;

    public Salary(String salaryLel, double basicSalary, double jobSalary, double trafficSubsidy) {
        this.salaryLel = salaryLel;
        this.basicSalary = basicSalary;
        this.jobSalary = jobSalary;
        this.trafficSubsidy = trafficSubsidy;
    }

    public Salary() {
    }

    public String getSalaryLel() {
        return salaryLel;
    }

    public void setSalaryLel(String salaryLel) {
        this.salaryLel = salaryLel;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(double jobSalary) {
        this.jobSalary = jobSalary;
    }

    public double getTrafficSubsidy() {
        return trafficSubsidy;
    }

    public void setTrafficSubsidy(double trafficSubsidy) {
        this.trafficSubsidy = trafficSubsidy;
    }
}
