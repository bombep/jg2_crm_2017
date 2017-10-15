package lv.jg2crm.domain;

public class LocalUser {
    private Integer id;
    private String username;
    private String password;
    private String realname;
    private String role;

    public LocalUser(Integer id, String login, String password, String realname, String role) {
        this.id = id;
        this.username = login;
        this.password = password;
        this.realname = realname;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

        if (!id.equals(localUser.id)) return false;
        if (!username.equals(localUser.username)) return false;
        if (!password.equals(localUser.password)) return false;
        if (!realname.equals(localUser.realname)) return false;
        return role.equals(localUser.role);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + realname.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }
}
