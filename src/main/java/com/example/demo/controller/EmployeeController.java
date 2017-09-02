package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api(value="employee service", description="Sample Employee Service")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Value("${some.property}")
	private String prop1;
	
	@ApiOperation(value = "View a list of employees", response = List.class)
	@RequestMapping(value = "employee", method = RequestMethod.GET)
	public List<Employee> list() {
		return employeeService.list();
	}

	@RequestMapping(value = "employee", method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee) {
		return employeeService.create(employee);
	}

	@RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
	public Employee get(@PathVariable Long id) {
		System.out.println("System property : "+prop1);
		return employeeService.get(id);
	}
}
