package CourseSelection;

/**
 * 此类为教师选课管理系统
 */
public class Teacher2 {
    private String sex;

    private String profession; //表示所学的专业

    private String id;

    private String name;

    private String birth;

    private String departmentId;

    public Teacher2() {
    }

    public Teacher2(String sex, String profession, String id, String name, String birth, String departmentId) {
        this.sex = sex;
        this.profession = profession;
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.departmentId = departmentId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
