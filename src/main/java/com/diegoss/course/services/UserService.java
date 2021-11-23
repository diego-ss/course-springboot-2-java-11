package com.diegoss.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.diegoss.course.entities.User;
import com.diegoss.course.repositories.UserRepository;
import com.diegoss.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		var oldUser = repository.getOne(id);
		updateData(oldUser, user);
		return repository.save(oldUser);
	}
	
	private void updateData(User oldUser, User user) {
		oldUser.setEmail(user.getEmail());
		oldUser.setName(user.getName());
		oldUser.setPhone(user.getPhone());
	}
}
