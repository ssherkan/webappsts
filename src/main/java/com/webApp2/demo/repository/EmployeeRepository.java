package com.webApp2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webApp2.demo.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
