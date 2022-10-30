package com.xadmin.swagger.service;

import com.xadmin.swagger.dao.UserRepository;
import com.xadmin.swagger.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private UserRepository repository;

    public  String savePerson(Person person){
        repository.save(person);
        return "saved User with id" + person.getPersonId();
    }

    public List<Person> getAllPerson(){
        return repository.findAll();
    }

    public  List<Person> deletePersonById(int personId){
        repository.deleteById(personId);
        return repository.findAll();
    }




}
