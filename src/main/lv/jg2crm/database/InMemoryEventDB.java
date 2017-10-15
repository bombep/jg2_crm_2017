package lv.jg2crm.database;

import lv.jg2crm.domain.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryEventDB implements EventDB {
    private List<Event> eventList = new ArrayList<>();

    @Override
    public void add(Event event) {
        eventList.add(event);
    }

    @Override
    public boolean removedById(Integer id) {
        Optional<Event> foundEvent = eventList.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
        if (foundEvent.isPresent()) {
            Event event = foundEvent.get();
            eventList.remove(event);
            return true;
        } else return false;
    }
}
