package lv.jg2crm.database.customers;

import lv.jg2crm.domain.Customer;

public interface CustomerDB {

    void add(Customer customer);
    boolean removeByUsername(String username);
}
