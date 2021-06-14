package TeacherWorkLoad;

public class Department {
    private String departmentName;

    private String departmentId;

    public int departmentCount = 0; //部门人数

    public Department(String departmentName, String departmentId) {
        this.departmentName = departmentName;
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
