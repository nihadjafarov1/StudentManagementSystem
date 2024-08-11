package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.menu.inter.MenuShowStudentServiceInter;
import util.FileUtility;

public class MenuShowStudentService implements MenuShowStudentServiceInter {
    @Override
    public void processLogic() {
        Config object = (Config) FileUtility.readFileDeserialize("app.obj");
        Student[] students = object.getStudents();

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
