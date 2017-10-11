package lv.jg2crm.ui;

import java.util.Scanner;

public class LoginScreen {
    private String username;
    private String password;
    public void print () {
        System.out.println("Enter username/password");
    }

    public String getUsername(){
        return username = getStringFromUser();
    }
    public String getPassword(){
        return password = getStringFromUser();
    }
    private String getStringFromUser (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
