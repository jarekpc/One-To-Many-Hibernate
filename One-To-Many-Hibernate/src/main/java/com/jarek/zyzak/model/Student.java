package com.jarek.zyzak.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int student_id;
	
	private String phone_type;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="STUDENT_PHONE", joinColumns = @JoinColumn(name="STUDENT_ID"), inverseJoinColumns=@JoinColumn(name="PHONE_ID"))
	private Set<Phone> studentPhoneNumbers = new HashSet<Phone>(0);
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String phone_type) {
		super();
		this.phone_type = phone_type;
	}
	
	

	public Student(String phone_type, Set<Phone> studentPhoneNumbers) {
		super();
		this.phone_type = phone_type;
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	public String getPhone_type() {
		return phone_type;
	}

	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	public Set<Phone> getStudentPhoneNumbers() {
		return studentPhoneNumbers;
	}

	public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}
	
	
	
}
