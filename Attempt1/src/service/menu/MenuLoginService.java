package service.menu;

import bean.Config;
import service.menu.inter.Process;

import java.util.Scanner;

public class MenuLoginService implements Process {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Password: ");
        String password = sc2.nextLine();

        if (!username.equals("admin") && !password.equals("admin")) {
            throw new IllegalArgumentException("Invalid username or password");
        }
        Config.setLoggedIn(true);
    }
}
