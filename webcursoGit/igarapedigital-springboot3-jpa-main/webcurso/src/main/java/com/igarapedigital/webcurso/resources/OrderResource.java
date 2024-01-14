package com.igarapedigital.webcurso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igarapedigital.webcurso.entities.Order;
import com.igarapedigital.webcurso.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;

	@GetMapping
	//public ResponseEntity<Order> findAll() {
	public ResponseEntity<List<Order>> findAll() {
		// Order u = new Order (1L, "Maria", "maria@gmail.com", "99999999", "12345");
		List<Order> list = service.findAll();
		//return ResponseEntity.ok().body(u);
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	
	}

	
	
	
}
