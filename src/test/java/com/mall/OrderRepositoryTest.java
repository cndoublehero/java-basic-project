package com.mall;

import com.mall.domain.Order;
import com.mall.domain.OrderRepository;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderRepositoryTest {

    @Test
    public void should_be_success_when_save_order() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        Order order = new Order("1", null);
        boolean saveResult = orderRepository.save(order);
        assertTrue(saveResult);
    }

    @Test
    public void status_should_be_save_when_save_order_success() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        orderRepository.save(new Order("1", null));
        assertEquals("save", orderRepository.getStatus());
    }

    @Test
    public void should_be_not_null_when_save_order_success() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        orderRepository.save(new Order("1", null));
        assertNotNull(orderRepository.getById("1"));
    }

    @Test
    public void should_events_not_null_when_save_order_success() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        orderRepository.save(new Order("1", null));
        assertNotNull(orderRepository.getEvents());
    }

    @Test
    public void should_be_null_when_no_operation_exist() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        assertNull(orderRepository.getStatus());
    }
}
