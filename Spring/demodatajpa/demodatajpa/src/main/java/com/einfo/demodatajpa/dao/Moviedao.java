package com.einfo.demodatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.einfo.demodatajpa.model.Movie;

@Repository

public interface Moviedao extends JpaRepository<Movie,Integer> {
	
	

}
