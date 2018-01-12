package com.mall.domain;

public class Event {
    private String eventId;
    private EventType eventType;
    private String eventContent;

    public Event(String eventId, EventType eventType, String eventContent) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.eventContent = eventContent;
    }

    public String getEventContent() {
        return eventContent;
    }

    public String getEventId() {
        return eventId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public enum EventType {
        CREATED,
        SAVED,
        PAYED,
        FINISHED;
    }

}
