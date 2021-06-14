package CourseSelection;

/**
 * 该类是课程信息的管理类，
 */
public class SubjectsManager {
    private String subjectId;

    private String subjectName;

    private int subjectTime;

    private  int subjectClazzCount; //表示的是这门课有多少个班级

    private boolean choice;   //判断是否这门课被选中

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectTime() {
        return subjectTime;
    }

    public void setSubjectTime(int subjectTime) {
        this.subjectTime = subjectTime;
    }

    public int getSubjectClazzCount() {
        return subjectClazzCount;
    }

    public void setSubjectClazzCount(int subjectClazzCount) {
        this.subjectClazzCount = subjectClazzCount;
    }

    public boolean isChoice() {
        return choice;
    }

    public void setChoice(boolean choice) {
        this.choice = choice;
    }
}
