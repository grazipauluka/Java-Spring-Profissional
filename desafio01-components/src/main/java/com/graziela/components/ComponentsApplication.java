package com.graziela.components;

import com.graziela.components.entities.Order;
import com.graziela.components.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class ComponentsApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ComponentsApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034,150.0,20.0);
		System.out.println("Pedido codigo: "+ order.getCode());
		System.out.println("Valor total: "+ orderService.total(order));
		System.out.println();

		Order order2 = new Order(2282,800.00,10.0);
		System.out.println("Pedido codigo: "+ order2.getCode());
		System.out.println("Valor total: "+ orderService.total(order2));
		System.out.println();

		Order order3 = new Order(1309,95.90, 0.0);
		System.out.println("Pedido codigo: "+ order3.getCode());
		System.out.println("Valor total: "+ orderService.total(order3));

	}
}
