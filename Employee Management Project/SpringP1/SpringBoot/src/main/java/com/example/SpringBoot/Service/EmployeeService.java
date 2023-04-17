package com.example.SpringBoot.Service;

import java.util.List;

import com.example.SpringBoot.DTO.EmployeeDTO;
import com.example.SpringBoot.DTO.EmployeeSaveDTO;
import com.example.SpringBoot.DTO.EmployeeUpdateDTO;

public interface EmployeeService {

	String addEmployee(EmployeeSaveDTO employeeSaveDTO);

	

	List<EmployeeDTO> getAllEmployee();



	String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO);



	boolean deleteEmployee(int id);

}
