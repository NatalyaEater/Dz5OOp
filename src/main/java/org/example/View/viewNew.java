package org.example.View;
import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class viewNew implements WorkView{
    public int mainMenu() {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int flag = 0;
        while (flag == 0) {
            System.out.println("Для работы с группами введите учителей и студентов");
            System.out.println("Меню:");
            System.out.println("1-Создать студента");
            System.out.println("2-Создать учителя");
            System.out.println("3- Ввести группу");
            System.out.println("4- Показать состав групп");
            System.out.println("5- Выход.");
            System.out.print("Пожалуйста выберите пункт меню ");
            answer = sc.nextInt();
            if (answer < 1 || answer > 5) {
                System.out.println("error");
            } else {
                flag = 1;
            }
        }
        return answer;
    }

    @Override
    public void GroupList(List<Group> groupList){
        System.out.println("Список групп ");
        for (Group group : groupList) {
            group.GroupInfo();
        }
        System.out.println();
    }

    @Override
    public Teacher menuChooseTeacher(List<Teacher> teacherList){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        System.out.println("Укажите учителя для группы");
        for (Teacher teacher : teacherList) {
            teacher.UserInfo();
        }
        int flag = 0;
        while (flag == 0) {
            System.out.print("Укажите ID нужного учителя ");
            answer = sc.nextInt();
            if (answer < 0) {
                System.out.println("error");
            }
            else
            {
                flag = 1;
            }
        }
        return  teacherList.get(answer-1);
    }
    @Override
    public List<Student> menuChooseStudents(List<Student> studentList){
        List<Student> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        System.out.println("Укажите студентов для группы ");
        for (Student student : studentList) {
            student.UserInfo();}
        int flag = 0;
        while (flag == 0) {
            System.out.print("Укажите ID студента, для выхода введите 0 -> ");
            answer = sc.nextInt();
            if (answer < 0 )
            {
                System.out.println("error");
            }
            else if (answer == 0)
            {
                flag = 1;
            }
            else
            {
                result.add(studentList.get(answer-1));
            }
        }
        return result;
    }
}
