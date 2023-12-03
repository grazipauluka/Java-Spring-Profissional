package com.graziela.components.services;

import com.graziela.components.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasicPrice()-order.getDiscount()+shippingService.shipment(order);
    }
}
