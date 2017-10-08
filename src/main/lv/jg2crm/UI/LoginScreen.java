package lv.jg2crm.UI;

import java.util.Scanner;

public class LoginScreen {
    static String username;
    static String password;
    public static void print () {
        System.out.println("Enter username/password");
    }

    static public String getUsername(){
        return username = getStringFromUser();
    }
    static public String getPassword(){
        return password = getStringFromUser();
    }
    static String getStringFromUser (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
