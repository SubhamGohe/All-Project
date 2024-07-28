package com.api.marketing.Entities;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

  @Entity
  public class Marketing {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
     @Column(length = 20 , nullable =true)
      private String name;
     @Column(length = 20 , nullable =true)
      private String phone;
     @Column(length = 20 , nullable =true)
      private String brand;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
     
     
     

	
}
