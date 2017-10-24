package lv.jg2crm.ui;

import lv.jg2crm.businesslogic.AddCustomerService;
import lv.jg2crm.businesslogic.IAddCustomerService;
import lv.jg2crm.businesslogic.api.AddCustomerRequest;

import java.util.Scanner;

public class AddCustomerView implements View {


    private IAddCustomerService addCustomerService;

    public AddCustomerView(IAddCustomerService addCustomerService) {
        this.addCustomerService = addCustomerService;
    }

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
        addCustomerService.addCustomer(new AddCustomerRequest(nickname, realname));
        /////// End of Business Logic

        System.out.println("Create customer execution end!");
        System.out.println();

    }

}
