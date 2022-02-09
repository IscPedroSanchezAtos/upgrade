package com.upgrade.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upgrade.model.Tbl_Users;

public interface Tbl_UsersDAO extends JpaRepository<Tbl_Users, Integer> {

}
