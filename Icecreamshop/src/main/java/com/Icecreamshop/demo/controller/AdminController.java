package com.Icecreamshop.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Icecreamshop.demo.model.Admin;
import com.Icecreamshop.demo.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	AdminService AdminController;
	
	@GetMapping("/login")
	
	public String Adminlogins(@RequestParam String email, @RequestParam String password,@RequestParam String mobilenumber,@RequestParam String username)
	{
	  return AdminController.adminlogin(email,password,mobilenumber,username);
	}
}
