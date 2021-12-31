package com.gl.employeeMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gl.employeeMgmt.entity.*;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
