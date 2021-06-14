package TeacherWorkLoad;

/**
 * 该类为教师工作量管理系统
 */
public class Teacher {
    private String education ;  // 表示教师的学历

    private String id;

    private String name;

    private String birthDate;

    private String departmentId;

    public Teacher() {
    }

    public Teacher(String education, String id, String name, String birthDate, String departmentId) {
        this.education = education;
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.departmentId = departmentId;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getId() {
        return id;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
