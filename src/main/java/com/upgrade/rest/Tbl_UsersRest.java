package com.upgrade.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.upgrade.dao.Tbl_UsersDAO;
import com.upgrade.model.Tbl_Users;


@RestController
@RequestMapping("/users")
public class Tbl_UsersRest {
	@Autowired
	private Tbl_UsersDAO tbl_usersDAO;
	
	@PostMapping("/add")
	public void add(@RequestBody Tbl_Users tbl_users) {
		tbl_usersDAO.save(tbl_users);
	}
	
	@GetMapping("/list")
	public List<Tbl_Users> list(){
		return tbl_usersDAO.findAll();
	}
	
	@DeleteMapping("/delete/{id_user}")
	public void delete(@PathVariable("id_user") Integer id_user) {
		tbl_usersDAO.deleteById(id_user);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Tbl_Users tbl_users) {
		tbl_usersDAO.save(tbl_users);
	}
}
