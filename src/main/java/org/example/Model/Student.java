package org.example.Model;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;

@Data
@AllArgsConstructor

public class Student extends User{
    String faculty;
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите  имя студента ");
        this.name = sc.next();


        System.out.print("Введите факультет ");
        this.faculty = sc.next();

        System.out.print("Введите Id студента начиная с 1 ,соблюдайте очередность");
        this.userID = sc.nextInt();
    }

    public void StudentInfo(){
        System.out.println("ID: " + getUserID());
        System.out.println("Имя: " + getName());
        System.out.println("Факультет: " + getFaculty());
        System.out.println("Группа: " + getGroupID());
    }
}

