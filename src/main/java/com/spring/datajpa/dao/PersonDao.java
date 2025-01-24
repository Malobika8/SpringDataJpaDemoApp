package com.spring.datajpa.dao;

import com.spring.datajpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Integer> {
}
