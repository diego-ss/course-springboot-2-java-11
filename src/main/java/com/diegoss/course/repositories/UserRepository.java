package com.diegoss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegoss.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
