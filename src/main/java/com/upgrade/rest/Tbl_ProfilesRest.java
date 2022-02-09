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

import com.upgrade.dao.Tbl_ProfilesDAO;
import com.upgrade.model.Tbl_Profiles;

@RestController
@RequestMapping("/profiles")
public class Tbl_ProfilesRest {

	@Autowired
	private Tbl_ProfilesDAO tbl_profilesDAO;
	
	@PostMapping("/add")
	public void add(@RequestBody Tbl_Profiles tbl_profiles) {
		tbl_profilesDAO.save(tbl_profiles);
	}
	
	@GetMapping("/list")
	public List<Tbl_Profiles> list(){
		return tbl_profilesDAO.findAll();
	}
	
	@DeleteMapping("/delete/{id_profile}")
	public void delete(@PathVariable("id_profile") Integer id_profile) {
		tbl_profilesDAO.deleteById(id_profile);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Tbl_Profiles tbl_profiles) {
		tbl_profilesDAO.save(tbl_profiles);
	}
}
