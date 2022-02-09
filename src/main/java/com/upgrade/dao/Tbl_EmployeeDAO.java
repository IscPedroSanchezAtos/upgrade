package com.upgrade.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upgrade.model.Tbl_Employee;

public interface Tbl_EmployeeDAO extends JpaRepository<Tbl_Employee, Integer>{

}
