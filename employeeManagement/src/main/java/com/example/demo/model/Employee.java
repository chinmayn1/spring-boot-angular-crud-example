package com.example.demo.model;

import java.util.ArrayList;

import jakarta.persistence.*;

@Entity
@Table(name="employee")

public class Employee {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private Boolean enable;
	
	public Employee() {}
	
	public Employee(long id, String firstName, String lastName, String email, Boolean enable) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.enable=enable;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "first_name", nullable = false)

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Column(name = "enable", nullable = false)
	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", enable=" + enable + "]";
	}
	

}
