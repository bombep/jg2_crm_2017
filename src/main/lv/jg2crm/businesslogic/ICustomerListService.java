package lv.jg2crm.businesslogic;

import lv.jg2crm.businesslogic.api.CustomerListResponse;

public interface ICustomerListService {
    CustomerListResponse getCustomers();
}
