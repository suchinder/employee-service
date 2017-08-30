package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName; 
	private String lastName;   
	private int salary;  

	public Employee() {}
	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId( Long id ) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName( String first_name ) {
		this.firstName = first_name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName( String last_name ) {
		this.lastName = last_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary( int salary ) {
		this.salary = salary;
	}
}
