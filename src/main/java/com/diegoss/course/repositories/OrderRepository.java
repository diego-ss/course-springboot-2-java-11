package com.diegoss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegoss.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
