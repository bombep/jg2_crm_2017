package lv.jg2crm.domain;

public class Event {
    Integer id;
    Integer userId;
    Integer custId;
    String eventType;

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", userId=" + userId +
                ", custId=" + custId +
                ", eventType='" + eventType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (!id.equals(event.id)) return false;
        if (!userId.equals(event.userId)) return false;
        if (!custId.equals(event.custId)) return false;
        return eventType.equals(event.eventType);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + custId.hashCode();
        result = 31 * result + eventType.hashCode();
        return result;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Event(Integer id, Integer userId, Integer custId, String eventType) {

        this.id = id;
        this.userId = userId;
        this.custId = custId;
        this.eventType = eventType;
    }
}
