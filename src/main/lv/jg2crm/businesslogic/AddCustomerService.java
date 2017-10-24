package lv.jg2crm.businesslogic;

import lv.jg2crm.businesslogic.api.AddCustomerRequest;
import lv.jg2crm.businesslogic.api.AddRecordResponse;
import lv.jg2crm.database.customers.ICustomerDB;
import lv.jg2crm.domain.Customer;

public class AddCustomerService implements IAddCustomerService {

    private ICustomerDB customerDB;

    public AddCustomerService(ICustomerDB customerDB) {
        this.customerDB = customerDB;
    }

    @Override
    public AddRecordResponse addCustomer(AddCustomerRequest request){
        String company = "no company";

        //Customer customer= new Customer();


        return new AddRecordResponse(true);
    }

}
