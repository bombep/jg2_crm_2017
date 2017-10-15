package lv.jg2crm.database.users;

import lv.jg2crm.domain.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryCustomerDB implements CustomerDB {
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public boolean removeByUsername(String username) {
        Optional<Customer> foundUsername = customerList.stream()
                .filter(customer -> customer.getUsername().equals(username))
                .findFirst();
        if (foundUsername.isPresent()) {
            Customer customer = foundUsername.get();
            customerList.remove(customer);
            return true;
        } else return false;
    }


}
