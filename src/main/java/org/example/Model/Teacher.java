package org.example.Model;

import lombok.Data;


import java.util.Scanner;


@Data


public class Teacher extends User implements UserData{


    @Override
    public void User(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя учителя ");
        this.name = sc.nextLine();

        System.out.print("Введите Id учителя начиная с 1 ,соблюдайте очередность ");
        this.userID = sc.nextInt();
    }
    @Override
    public void UserInfo(){
        System.out.println("ID: " + getUserID());
        System.out.println("Имя: " + getName());
        System.out.println("Группа: " + getGroupID());
    }

}