package com.netjstech.account.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.netjstech.account.dto.Employee;

public class EmployeeDaoImp1 implements EmployeeDao {

	List<Employee> empList=new ArrayList<Employee>();
	@Override
	public Employee findEmployeeById(int empId) {
		Connection conn;
		try {
			conn = DBUtil.getDBConnection();
			PreparedStatement pstmt =  conn.prepareStatement("select empno, ename, job, hiredate, sal from emp");
			while(rs)
		}
	}
	public List<Employee> getEmployees()
	{
		System.out.println("Dao - in getEmployees");
		Employee employee=new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("hemant");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(80000);
		employee.setJob("Developer");
		empList.add(employee);
		employee=new Employee();
		employee.setEmpNo(2);
		employee.setEmpName("varsha");
		employee.setHireDate(LocalDate.of(2016, 07, 02));
		employee.setSalary(10000);
		employee.setJob("Developer");
		empList.add(employee);
		return empList;
		
		
	}
	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findEmployeeByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empList.remove(emp);
		
	}
	public void insertEmployeeWithValues()
	{
		Connection conn = null;
		try {
			conn = DBUtil.getDBConnection();
			Statement stmt = conn.createStatement();
			int count = stmt.executeUpdate("insert into emp values(8, 'sachin', 'sales',2, '12-jan-2010', 1200,12,4)");
			System.out.println("Record is inserted successfully!!" + count);
		}catch(SQLException e) {
			e.PrintStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.PrintStachTrace();
				}
			}
		}
		
	}


public void insertEmployee(Employee e)
{
	Connection conn = null;
	try {
		conn = DBUtil.getDBConnection();
		Statement stmt = conn.createStatement();
		String sql="insert into emp values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		pstmt.setInt(1,e.getEmpNo());
		pstmt.setString(2, e.getEmpName());
		pstmt.setString(3, e.getJob());
		pstmt.setInt(4, e.getMgr());
		pstmt.setDate(5,  Date.valueOf(e.getHireDate()));
		pstmt.setDouble(6,  );
	}
}