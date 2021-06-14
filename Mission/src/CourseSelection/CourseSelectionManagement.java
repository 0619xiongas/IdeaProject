package CourseSelection;

import java.util.*;

/**
 * 该类是教师选课的管理类
 */
public class CourseSelectionManagement {

    /*
    利用hashmap去实现教师的选课和设置课程的授课老师
     */
    HashMap <SubjectsManager,Teacher2>  map = new HashMap<>();

    public void teacherChooseSubject(SubjectsManager sm,Teacher2 teacher2){
        map.put(sm,teacher2);
    }
}
