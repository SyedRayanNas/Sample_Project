package com.example.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public Object getUserDetails() {
		// TODO Auto-generated method stub
		return "Welcome Syed This is Jenkins Auto Deployment Project ";
	}

}
