package com.upgrade.rest;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upgrade.dao.Tbl_EmployeeDAO;
import com.upgrade.model.Tbl_Employee;

@RestController
@RequestMapping("/employee")
public class Tbl_EmployeeRest {

	@Autowired
	private Tbl_EmployeeDAO tbl_employeeDAO;
	
	@PostMapping("/add")
	public void add(@RequestBody Tbl_Employee tbl_employee) {
		tbl_employeeDAO.save(tbl_employee);
	}
	
	@GetMapping("/list")
	public List<Tbl_Employee> list(){
		return tbl_employeeDAO.findAll();
	}
	
	@DeleteMapping("/delete/{id_employee}")
	public void delete(@PathVariable("id_employee") Integer id_employee) {
		tbl_employeeDAO.deleteById(id_employee);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Tbl_Employee tbl_employee) {
		tbl_employeeDAO.save(tbl_employee);
	}
}
