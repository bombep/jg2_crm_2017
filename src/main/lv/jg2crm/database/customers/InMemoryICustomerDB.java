package lv.jg2crm.database.customers;

import lv.jg2crm.domain.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryICustomerDB implements ICustomerDB {
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public boolean removeByUsername(String username) {
        Optional<Customer> foundUsername = customerList.stream()
                .filter(customer -> customer.getNickname().equals(username))
                .findFirst();
        if (foundUsername.isPresent()) {
            Customer customer = foundUsername.get();
            customerList.remove(customer);
            return true;
        } else return false;
    }




    @Override
    public List<Customer> getAll(){
        List<Customer> theCopyOfCustomerList = new ArrayList<>();
        theCopyOfCustomerList.addAll(customerList);
        return theCopyOfCustomerList;
    }


}
