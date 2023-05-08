package com.Icecreamshop.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Icecreamshop.demo.model.CustomerDetail;
import com.Icecreamshop.demo.repository.CustomerDetailRepository;

@Service
public class CustomerDetailService {

	@Autowired
	CustomerDetailRepository customerdetailrepository;
	
	public List<CustomerDetail>fetchAllCustomerDetail()
	{
		return customerdetailrepository.findAll();
	}
	public CustomerDetail saveCustomerDetail(CustomerDetail c)
	{
		return customerdetailrepository.save(c);
	}
	public  CustomerDetail updateCustomerDetail(CustomerDetail c,Long id) {
		Optional<CustomerDetail> optional=customerdetailrepository.findById(id);
		CustomerDetail obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setPassword(c.getPassword());
			obj.setEmail(c.getEmail());
			obj.setName(c.getName());
		customerdetailrepository.saveAndFlush(c);
		}
		return obj;
	}
	public void deleteCustomerDetail(Long c) 
	{
		customerdetailrepository.deleteById(c);
	}

}
