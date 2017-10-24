package lv.jg2crm.businesslogic;

import lv.jg2crm.businesslogic.api.AddCustomerRequest;
import lv.jg2crm.businesslogic.api.AddRecordResponse;

public interface AddCustomerServiceI {
    AddRecordResponse addCustomer(AddCustomerRequest request);
}
