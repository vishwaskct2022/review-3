package com.Icecreamshop.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Icecreamshop.demo.model.CustomerDetail;

public interface CustomerDetailRepository extends JpaRepository<CustomerDetail,Long> {

	@Query(value="SELECT c FROM CustomerDetail c join c.address a")
	List<CustomerDetail>getCustomerdetail();
}
