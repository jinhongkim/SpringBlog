package com.brody.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brody.blog.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer>{

}
