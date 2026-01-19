package com.sat.tmf.tkt.tktbooking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.tmf.tkt.tktbooking.dto.CreateUserDTO;
import com.sat.tmf.tkt.tktbooking.entity.User;
import com.sat.tmf.tkt.tktbooking.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;

	public User registerNewUser(CreateUserDTO user) {
		User userEntity = new User();
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPhNo(user.getPhNo());
		userEntity.setPassword(user.getPassword());
		
		userRepo.save(userEntity);
		return userRepo.save(userEntity);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public List<User> getUserByFirstName(String firstName){
		return userRepo.findByFirstName(firstName);
	}
	
	public List<User> searchUsers(String name) {
        return userRepo.searchByFirstName(name);
    }
}
