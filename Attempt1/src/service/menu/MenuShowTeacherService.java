package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.inter.MenuShowTeacherServiceInter;
import util.FileUtility;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void processLogic() {
        Config object = (Config)FileUtility.readFileDeserialize("app.obj");
        Teacher[] teachers = object.getTeachers();

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
