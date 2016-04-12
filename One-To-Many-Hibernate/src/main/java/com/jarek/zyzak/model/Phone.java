package com.jarek.zyzak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {

	@Id
	@GeneratedValue
	private int phone_id;
	
	private String phone_type;
	
	private String phone_Number;

	public Phone() {
	}

	public Phone(String phone_type, String phone_Number) {
		super();
		this.phone_type = phone_type;
		this.phone_Number = phone_Number;
	}

	public int getPhone_id() {
		return phone_id;
	}

	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}

	public String getPhone_type() {
		return phone_type;
	}

	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}

	public String getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	
	
	
}
