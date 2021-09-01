package com.netjstech.account.driver;

import java.util.List;

import com.netjstech.account.dao.EmployeeDao;
import com.netjstech.account.dao.EmployeeDaoImp1;
import com.netjstech.account.dto.Employee;
import com.netjstech.account.service.EmployeeService;
import com.netjstech.account.service.EmployeeServiceImp1;

public class EmployeeDriver {
	Employee emp;
	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDaoImp1();
		EmployeeService employeeService =new EmployeeServiceImp1(employeeDao);
		List<Employee>emplist=employeeService.getEmployees();
		System.out.println("Back with Employee List - "+emplist.size());
		for(Employee employee:emplist)
		{
			System.out.println(employee);
		}
		employeeService.insertEmployeeWithValues();
		
	}
}