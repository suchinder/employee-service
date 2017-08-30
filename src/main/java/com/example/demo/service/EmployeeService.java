package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.*;
import com.example.demo.model.*;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRespository employeeRepository;
	
	public List<Employee> list() {
		return employeeRepository.findAll();
	}
	
	public Employee get(Long id) {
		return employeeRepository.findOne(id);
	}
	
	public Employee create(Employee employee) {
		return employeeRepository.saveAndFlush(employee);
	}
}
