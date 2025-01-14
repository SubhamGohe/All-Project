package com.api.marketing.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "leads")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	@Column(name="First_Name",nullable = false,length = 50)
	private String firstName;
	@Column(name="Last_Name",nullable = false,length = 50)
	private String lastName;
	@Column(name= "Email id",nullable = false,length = 30)
	private String email;
	@Column(name= "Mobile",nullable=false,length= 10)
	private String mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
  
}
