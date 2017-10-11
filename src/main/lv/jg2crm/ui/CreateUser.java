package lv.jg2crm.ui;

import java.util.Scanner;

public class CreateUser {
    Scanner scanner = new Scanner(System.in);
    String username;
    String password;
    String realname;

    public String getUsernameFromUser (){

        username = scanner.nextLine();

        return username;
    }

    public String getPasswordFromUser() {
        return password = scanner.nextLine();
    }

    public String getRealnameFromUser() {
        return realname = scanner.nextLine();
    }

}
