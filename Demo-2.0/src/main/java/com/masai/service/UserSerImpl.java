package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.UserDtl;
import com.masai.repositary.UserRepository;

@Service
public class UserSerImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDtl registerUser(UserDtl user) {
		
			  return userRepo.save(user);
	}

	@Override
	public List<UserDtl> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
