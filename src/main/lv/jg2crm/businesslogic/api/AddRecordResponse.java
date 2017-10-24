package lv.jg2crm.businesslogic.api;

public class AddRecordResponse {
    private boolean result;

    public AddRecordResponse(boolean result) {
        this.result = result;
    }

    public boolean isResult() {
        return result;
    }
}
