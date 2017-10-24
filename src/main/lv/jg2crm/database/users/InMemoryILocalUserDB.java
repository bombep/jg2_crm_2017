package lv.jg2crm.database.users;

import lv.jg2crm.domain.LocalUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryILocalUserDB implements ILocalUserDB {
    private List<LocalUser> localUserList = new ArrayList<>();

    @Override
    public void add(LocalUser localUser) {
        localUserList.add(localUser);
    }

    @Override
    public boolean removeByUsername(String username) {
        Optional<LocalUser> foundLocalUser = localUserList.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
        if (foundLocalUser.isPresent()) {
            LocalUser localUser = foundLocalUser.get();
            localUserList.remove(localUser);
            return true;
        } else return false;
    }


}
