package com.mall;

import com.mall.domain.Event;
import com.mall.domain.Order;
import com.mall.domain.OrderRepository;

import java.util.*;

public class OrderRepositoryImpl implements OrderRepository {
    private Map<String, Order> orderMap = new HashMap<String, Order>();
    private List<Event> events = new ArrayList<Event>();

    public boolean save(Order order) {
        orderMap.put(order.getId(), order);
        Event event = new Event(UUID.randomUUID().toString(), Event.EventType.SAVED, null);
        events.add(event);
        return true;
    }

    public String getStatus() {
        if (events.isEmpty()) {
            return null;
        }
        Event lastEvent = events.get(events.size() - 1);
        switch (lastEvent.getEventType()) {
            case SAVED:
                return "save";
        }
        return null;
    }

    public Order getById(String id) {
        return orderMap.get(id);
    }

    public List<Event> getEvents() {
        return events;
    }
}
