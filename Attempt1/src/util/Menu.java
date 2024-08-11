package util;

import bean.Config;
import service.menu.*;
import service.menu.inter.Process;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add Teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add Student", new MenuAddStudentService()),
    SHOW_ALL_TEACHERS(5, "Show All Teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENTS(6, "Show All Students", new MenuShowStudentService()),
    UNKNOWN(-1, "Unknown", null);

    public String getLabel() {
        return label;
    }

    public int getNumber() {
        return number;
    }

    private int number;
    private String label;
    private Process menuService;

    Menu(int number, String label, Process menuService) {
        this.number = number;
        this.label = label;
        this.menuService = menuService;
    }

    @Override
    public String toString() {
        return number + ". " + label;
    }

    public void process() {
        menuService.process();
        MenuUtil.showMenu();
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != Menu.UNKNOWN) {
                if (menus[i] == Menu.LOGIN || menus[i] == Menu.REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
}

