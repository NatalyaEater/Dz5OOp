package org.example.Model;
import lombok.Data;
import java.util.List;
import java.util.Scanner;
@Data


public class Group {
    int groupID;
    Teacher teacher;
    List<Student> studentList;
    public Group(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите  номер группы  ");
        setGroupID(sc.nextInt());
    }
    public void GroupInfo(){
        System.out.println("ID: " + getGroupID());
        System.out.println("Учитель:");
        this.teacher.TeacherInfo();
        System.out.println("Студенты:");
        for (Student student: this.studentList){
            student.StudentInfo();
        }
    }
}
