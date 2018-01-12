package com.mall.domain;

import java.util.List;

public interface OrderRepository {
    boolean save(Order order);

    String getStatus();

    Order getById(String id);

    List<Event> getEvents();
}
