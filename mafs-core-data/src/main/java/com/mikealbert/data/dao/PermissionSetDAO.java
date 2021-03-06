package com.mikealbert.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikealbert.data.entity.PermissionSet;

/**
* DAO for PermissionSet Entity
*/
public interface PermissionSetDAO extends JpaRepository<PermissionSet, Long> {}
