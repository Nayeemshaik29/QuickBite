package com.quickbite.order_service.service;





import com.quickbite.order_service.entity.Order;

import java.util.List;

public interface OrderService {

    Order createOrder(Order order);

    Order getOrder(Long id);

    List<Order> getAllOrders();
}