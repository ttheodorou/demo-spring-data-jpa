package com.objis.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objis.spring.domaine.Gars;

public interface IGarsDao extends JpaRepository<Gars, Integer> {
	public List<Gars> findBySurnom(String surnom);

}
