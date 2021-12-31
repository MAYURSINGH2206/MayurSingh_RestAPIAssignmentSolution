package com.gl.employeeMgmt.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gl.employeeMgmt.entity.*;
import com.gl.employeeMgmt.repository.*;
import com.gl.employeeMgmt.service.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	
	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public String addEmployee(Employee theEmployee) {
		employeeRepository.saveAndFlush(theEmployee);
		return "Employee" +theEmployee + "saved"  ;
	}

	@Override
	public String deleteById(int theId) {
		employeeRepository.deleteById(theId);
		return "The employee with Id " +theId +" deleted";
	}
	
	

	@Override
	public List<Employee> searchBy(String firstName) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("firstName", 
				ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("ID","lastName","email");
		Example<Employee> example = Example.of(employee, exampleMatcher);
		return employeeRepository.findAll(example);
	}

	@Override
	public List<Employee> getEmployeesCustomSortedByName(Direction direction) {
		return employeeRepository.findAll(Sort.by(direction, "firstName"));
	}

	@Override
	public String save(Employee theEmployee) {
		employeeRepository.save(theEmployee);
		return "Employee saved";
	}

	@Override
	public Employee findById(int id) {
		 Optional<Employee> result = employeeRepository.findById(id);
		 
		 Employee theEmployee = null;
			
			if (result.isPresent()) {
				theEmployee = result.get();
			}
			else {
				// we didn't find the employee
				throw new RuntimeException("Did not find employee id - " + id);
			}
			
			return theEmployee;
			}


	@Override
	public User saveUser(User theuser) {
		theuser.setPassword(encoder().encode(theuser.getPassword()));
		return userRepository.save(theuser);
	}


	@Override
	public Role saveRole(Role theRole) {
		
		return roleRepository.save(theRole);
	}

}