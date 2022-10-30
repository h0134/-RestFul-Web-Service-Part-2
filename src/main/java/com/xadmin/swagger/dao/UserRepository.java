package com.xadmin.swagger.dao;

import com.xadmin.swagger.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person,Integer> {

}
