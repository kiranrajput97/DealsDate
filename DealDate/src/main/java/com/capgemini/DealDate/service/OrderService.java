package com.capgemini.DealDate.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.DealDate.DAO.OrderDAO;
import com.capgemini.DealDate.Entity.Order;




@Service
public class OrderService {

	@Autowired
	OrderDAO orderDao;
	
	 public boolean addBook(Order order)
	 {
		 return orderDao.save(order)!= null;
	 }
	 
	 public ArrayList<Order> getAllOrder()
	 {
		 return (ArrayList<Order>) orderDao.findAll();
	 }
	 
	 public void deleteOrder(Integer orderId)
	 {
		orderDao.deleteById(orderId);
		 
	 }
}
