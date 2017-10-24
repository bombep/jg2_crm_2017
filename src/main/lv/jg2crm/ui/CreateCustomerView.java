package lv.jg2crm.ui;

import java.util.Scanner;

public class CreateCustomerView implements View {

    @Override
    public void execute(){
        System.out.println();
        System.out.println("Create customer execution start!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer nickname:");
        String nickname = sc.nextLine();
        System.out.print("Enter customer real name:");
        String realname = sc.nextLine();

        /////// Business Logic
        //addProductService.addProduct(new AddProductRequest(title, description));
        /////// End of Business Logic

        System.out.println("Create customer execution end!");
        System.out.println();

    }

}
