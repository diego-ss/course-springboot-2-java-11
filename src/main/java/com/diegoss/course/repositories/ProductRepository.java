package com.diegoss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegoss.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
