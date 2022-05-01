package com.webApp2.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webApp2.demo.repository.EmployeeRepository;
import com.webApp2.demo.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
	private EmployeeRepository employeeRespository;
    
    //get all emp 
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
    	return employeeRespository.findAll();
    }
    
	// create employee rest api
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRespository.save(employee);
	}
    
    
}
