package lv.jg2crm.database.events;

import lv.jg2crm.domain.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IEventDB {

    void add(Event event);

    boolean removedById(Integer id);
}
