package com.capgemini.DealDate.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.DealDate.Entity.Order;
import com.capgemini.DealDate.Exception.OrderException;
import com.capgemini.DealDate.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@DeleteMapping("/deleteOrder/{orderId}")
	public ResponseEntity<String> deleteOrder(@PathVariable Integer orderId) throws OrderException {
		try {
			orderService.deleteOrder(orderId);
			return new ResponseEntity<>("Order Deleted sucessfully", HttpStatus.OK);
		} catch (Exception exception) {
			throw new OrderException(exception.getMessage());
		}

	}
	
	@GetMapping("/orders")
	public ArrayList<Order> getAllOrder() throws OrderException {
		try{
			return orderService.getAllOrder();
		}catch (Exception exception) {
			throw new OrderException(exception.getMessage());
		}
	}
	
	@PostMapping("/addOrder")
	public ResponseEntity<String> addOrder( @RequestBody Order order) throws OrderException {
		
		try {
			orderService.addBook(order);
			return new ResponseEntity<String>("Book added in order successfully", HttpStatus.OK);

		} catch (DataIntegrityViolationException ex) {
			throw new OrderException(ex.getMessage());
		}
	}

}
