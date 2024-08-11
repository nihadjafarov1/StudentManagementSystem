package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuAddStudentServiceInter;
import util.FileUtility;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ender student name: ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("ender student surname: ");
        String surname = sc2.nextLine();

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);


        Config object = (Config) FileUtility.readFileDeserialize("app.obj");

        Config.setConfig(object);
        Config.instance().appendStudent(student);

        System.out.println("Student added");

        Config.save();
    }
}
