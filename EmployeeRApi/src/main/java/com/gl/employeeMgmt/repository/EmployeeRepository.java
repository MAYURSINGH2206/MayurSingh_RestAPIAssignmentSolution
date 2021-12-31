package com.gl.employeeMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gl.employeeMgmt.entity.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

