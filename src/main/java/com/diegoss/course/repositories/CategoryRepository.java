package com.diegoss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegoss.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
