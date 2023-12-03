package com.graziela.components.services;

import com.graziela.components.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double shipment;

        if (order.getBasicPrice() <= 100.0) {
            shipment = 20.0;
        } else if (order.getBasicPrice() > 100 && order.getBasicPrice() <200.0){
            shipment = 12.0;
        } else {
            shipment = 0;
        }

        return shipment;
    }
}
