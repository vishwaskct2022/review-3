package com.Icecreamshop.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Icecreamshop.demo.model.Admin;
import com.Icecreamshop.demo.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository AdminService;
	
	public String login(String email,String password,String mobilenumber,String username)
	{
		List<Admin> adm=AdminService.findAll();
		String result=null;
		for(Admin i:adm) {
			if(i.getEmail().equals(email)&&i.getPassword().equals())
		}
	}
	
}
