package com.mall.domain;

import java.util.List;

/**
 * Created by xkt on 2018/1/12.
 */
public interface OrderRepository {
    boolean save(Order order);

    String getStatus();

    Order getById(String id);

    List<Event> getEvents();
}
