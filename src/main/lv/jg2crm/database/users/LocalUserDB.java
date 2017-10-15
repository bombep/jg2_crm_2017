package lv.jg2crm.database.users;

import lv.jg2crm.domain.LocalUser;

public interface LocalUserDB {

    void add(LocalUser localUser);
    boolean removeByUsername(String username);
}
