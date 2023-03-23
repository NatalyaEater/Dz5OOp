package org.example.Controler;
import org.example.Model.Model;
import org.example.Model.Student;
import org.example.Model.Teacher;
import org.example.Model.Group;
import org.example.View.viewNew;


public class Controler {
    public void init(){
        viewNew cv = new viewNew();
        Model model = new Model();
        int answer = 1;
        while (answer != 7){
            answer = cv.mainMenu();
            switch (answer){
                case 1:
                    model.createUser(new Student());
                    break;
                case 2:
                    model.createUser(new Teacher());
                    break;
                case 3:
                    model.createGroup(
                            new Group(),
                            cv.menuChooseTeacher(model.getTeacherList()),
                            cv.menuChooseStudents(model.getStudentList()));
                    break;
                case 4:
                    cv.GroupList(model.getGroupList());
                    break;

            }
        }
    }

}
