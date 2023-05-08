package com.Icecreamshop.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Icecreamshop.demo.model.CustomerDetail;
import com.Icecreamshop.demo.service.CustomerDetailService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class CustomerDetailController {

	@Autowired
	CustomerDetailService customerdetailservice;
	
	@Tag(name="Get",description="get data")
	@GetMapping("/getAllCustomerDetail")
	public List<CustomerDetail>fetchAllCustomerDetail()
	{
		return customerdetailservice.fetchAllCustomerDetail();
	}
	@Tag(name="Post",description="post data")
	@PostMapping("/saveCustomerDetail")
	public CustomerDetail saveCustomerDetail(@RequestBody CustomerDetail c)
	{
		return customerdetailservice.saveCustomerDetail(c);
	}
	@Tag(name="Put",description="put data")
	@PutMapping("/updateCustomerDetail/{id}")
	public CustomerDetail updateCustomerDetail(@RequestBody CustomerDetail c,@PathVariable("id")Long id)
	{
		return customerdetailservice.updateCustomerDetail(c,id);
	}
	@Tag(name="Delete",description="delete data")
	@DeleteMapping("deleteCustomerDetails/{id}")
	public void deleteCustomerDetail(@PathVariable("id") Long id) 
	{
		customerdetailservice.deleteCustomerDetail(id);
	}
	
}
