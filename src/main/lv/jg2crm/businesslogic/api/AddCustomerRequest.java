package lv.jg2crm.businesslogic.api;

public class AddCustomerRequest {

    private String nickname;
    private String realname;

    public AddCustomerRequest(String nickname, String realname) {
        this.nickname = nickname;
        this.realname = realname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getRealname() {
        return realname;
    }
}
