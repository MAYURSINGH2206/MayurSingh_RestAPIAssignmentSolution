package com.gl.employeeMgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;

import com.gl.employeeMgmt.entity.*;

public interface EmployeeService {

	List<Employee> findAllEmployees();

	public Employee findById(int id);

	public String addEmployee(Employee theEmployee);

	public String deleteById(int theId);

	public String save(Employee theEmployee);

	public List<Employee> searchBy(String firstName);

	public List<Employee> getEmployeesCustomSortedByName(Direction direction);

	public User saveUser(User theuser);

	public 	Role saveRole(Role theRole);
}
