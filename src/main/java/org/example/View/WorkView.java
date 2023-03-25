package org.example.View;

import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface WorkView  {
    void GroupList(List<Group> groupList) ;

    Teacher menuChooseTeacher(List<Teacher> teacherList) ;

    List<Student> menuChooseStudents(List<Student> studentList) ;
}
