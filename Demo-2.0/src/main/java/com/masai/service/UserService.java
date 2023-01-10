package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.model.UserDtl;

public interface UserService {
	
	public UserDtl registerUser(UserDtl user);
	
	public List<UserDtl> getList();

}
