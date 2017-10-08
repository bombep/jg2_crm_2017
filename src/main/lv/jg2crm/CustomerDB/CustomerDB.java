package lv.jg2crm.CustomerDB;

import lv.jg2crm.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
    List<Customer> customerList = new ArrayList<>();
    public void print () {
        for (Customer c:customerList
             ) {
            System.out.println(c.toString());
        }
    }
    public void addCustomer (Customer customer) {
        customerList.add(customer);
    }
    public void delCustomer (Customer customer) {
        if (customerList.contains(customer)) {
            customerList.remove(customer);
        }
    }
}
