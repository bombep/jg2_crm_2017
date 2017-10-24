package lv.jg2crm.domain;


public class Customer {
/*
    id int NOT NULL AUTO_INCREMENT,
    nickname varchar(50), realname varchar (100),
    company varchar(50),
    profession varchar(50),
    address varchar(50),
    phone varchar(50),
    creationdatetime DATETIME,
    lastupdatedatetime DATETIME,
*/
    private Integer id;
    private String nickname;
    private String realname;
    private String company;
    private Integer phone;
    /* Не знаю какой тип данных должен быть у даты.
    По идеи нужно для переменной creationdate, ставить системное время на момент создания клиента */

    public Customer(int id, String nickname, String realname, String company, int phone) {
        this.id = id;
        this.nickname = nickname;
        this.realname = realname;
        this.company = company;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

     public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (phone != customer.phone) return false;
        if (nickname != null ? !nickname.equals(customer.nickname) : customer.nickname != null) return false;
        if (realname != null ? !realname.equals(customer.realname) : customer.realname != null) return false;
        return company != null ? company.equals(customer.company) : customer.company == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (realname != null ? realname.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + phone;
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", realname='" + realname + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
