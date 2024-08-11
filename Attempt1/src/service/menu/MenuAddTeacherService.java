package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.menu.inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddStudentServiceInter {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ender teacher name: ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("ender teacher surname: ");
        String surname = sc2.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);

        Config.instance().appendTeacher(teacher);

        Config.save();
    }
}
