package util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu(){
        Menu.showAllMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option");
        int option = sc.nextInt();

        Menu selectedMenu = Menu.find(option);
        selectedMenu.process();
    }

    public static void processMenu(Menu menu){
        menu.process();
    }
}
