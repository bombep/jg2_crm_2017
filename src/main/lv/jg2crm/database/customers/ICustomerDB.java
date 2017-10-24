package lv.jg2crm.database.customers;

import lv.jg2crm.domain.Customer;

import java.util.List;

public interface ICustomerDB {

    void add(Customer customer);
    boolean removeByUsername(String username);
    List<Customer> getAll();
}
