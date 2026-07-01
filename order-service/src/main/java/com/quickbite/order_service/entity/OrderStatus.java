package com.quickbite.order_service.entity;

public enum OrderStatus {
    CREATED,
    PAYMENT_PENDING,
    PAID,
    PREPARING,
    READY_FOR_PICKUP,
    OUT_FOR_DELIVERY,
    DELIVERED,
    CANCELLED
}
