package lv.jg2crm.businesslogic.api;

import lv.jg2crm.domain.Customer;

import java.util.List;

public class CustomerListResponse {
    private List<Customer> customers;

    public CustomerListResponse(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
