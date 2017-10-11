package lv.jg2crm.domain;

public class LocalUser {
    private int id;
    private String login;
    private String password;
    private String realname;
    private String role;

    public LocalUser(int id, String login, String password, String realname, String role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.realname = realname;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalUser localUser = (LocalUser) o;

        if (id != localUser.id) return false;
        if (!login.equals(localUser.login)) return false;
        if (!password.equals(localUser.password)) return false;
        if (!realname.equals(localUser.realname)) return false;
        return role.equals(localUser.role);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + realname.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "LocalUser{" +
                "id=" + id +
                ", username='" + login + '\'' +
                ", realname='" + realname + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
