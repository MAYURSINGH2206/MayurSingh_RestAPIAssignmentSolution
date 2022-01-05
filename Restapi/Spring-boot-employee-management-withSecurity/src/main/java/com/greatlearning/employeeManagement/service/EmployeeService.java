package com.greatlearning.employeeManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.employeeManagement.entity.Employee;
import com.greatlearning.employeeManagement.entity.Role;
import com.greatlearning.employeeManagement.entity.User;



public interface EmployeeService {

	List<Employee> findAllEmployees();

	Employee findById(int id);

	String addEmployee(Employee theEmployee);

	String deleteById(int theId);

	String save(Employee theEmployee);

	List<Employee> searchBy(String firstName);

	List<Employee> getEmployeesCustomSortedByName(Direction direction);

	User saveUser(User theuser);

	Role saveRole(Role theRole);

}
