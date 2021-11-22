package com.diegoss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegoss.course.entities.OrderItem;
import com.diegoss.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
