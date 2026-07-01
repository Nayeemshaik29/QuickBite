package com.quickbite.order_service.service;

import com.quickbite.order_service.entity.Order;
import com.quickbite.order_service.entity.OrderStatus;
import com.quickbite.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {

        order.setStatus(OrderStatus.CREATED);
        order.setCreatedAt(LocalDateTime.now());

        return orderRepository.save(order);
    }

    @Override
    public Order getOrder(Long id) {

        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }
}
