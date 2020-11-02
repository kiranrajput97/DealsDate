package com.capgemini.DealDate.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.DealDate.Entity.Order;



public interface OrderDAO extends JpaRepository<Order, Integer>{

}
