package com.Icecreamshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Icecreamshop.demo.model.Admin;

public interface AdminRepository extends JpaRepository <Admin,String>{

}
