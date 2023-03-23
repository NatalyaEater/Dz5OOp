package org.example.Model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Model {
    List<Student> studentList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();
    List<Group> groupList = new ArrayList<>();
    public void createUser(User user){
        if(user instanceof Student){
            studentList.add((Student) user);
        } else if (user instanceof Teacher){
            teacherList.add((Teacher) user);
        }
    }
    public void createGroup(Group group, Teacher teacher, List<Student> studentList){
        groupList.add(group);
        group.setTeacher(teacher);
        teacher.setGroupID(group.getGroupID());
        group.setStudentList(studentList);
        for (Student s: studentList) {
            s.setGroupID(group.getGroupID());
        }
    }

}
