package com.appointment.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table (name="Advisor")
public class Advisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long AdvisorID;
	
	public String name;
	public String department;
	public String email;
	
	public Advisor() {
		
	}
	
	public Advisor(String Name, String Department, String Email) {
		super();
		this.name = Name;
		this.department = Department;
		this.email = Email;
		
	}

	public long getAdvisorID() {
		return AdvisorID;
	}

	public void setAdvisorID(long advisorID) {
		AdvisorID = advisorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
