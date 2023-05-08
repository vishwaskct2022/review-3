package com.Icecreamshop.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Icecreamshop.demo.model.Registeration;
import com.Icecreamshop.demo.repository.RegisterationRepository;


@Service
public class RegisterationService {

	@Autowired
	RegisterationRepository RegisterationService;
	
	public List<Registeration> getAllRegisteration()
	{
		List<Registeration>registerationList=RegisterationService.findAll();
		return registerationList;
	}
	public Registeration saveRegisteration(Registeration r)
	{
		return RegisterationService.save(r);
	}
	public String login(String email,String password)
	{
		List<Registeration>log=RegisterationService.findAll();;
		String result=null;
		for(Registeration i:log) {
			if(i.getEmail().equals(email)&&i.getPassword().equals(password))
			{
				result="LoginSuccessfull";
			}
		}
		if(result==null)
		{
			result="LoginFailed";
		}
		return result;
	}
}
