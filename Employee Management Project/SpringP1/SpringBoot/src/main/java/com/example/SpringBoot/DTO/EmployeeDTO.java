package com.example.SpringBoot.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmployeeDTO {
	
	private int employeeid;
	private String employeename;
	private String employeeaddress;
	private int mobile;
	
	public EmployeeDTO(int employeeid, String employeename, String employeeaddress, int mobile) {
		
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeeaddress = employeeaddress;
		this.mobile = mobile;
	}

	public EmployeeDTO() {
		
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeeaddress() {
		return employeeaddress;
	}

	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeaddress="
				+ employeeaddress + ", mobile=" + mobile + "]";
	}
	
	
}
