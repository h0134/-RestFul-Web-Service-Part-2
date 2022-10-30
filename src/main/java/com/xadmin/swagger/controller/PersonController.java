package com.xadmin.swagger.controller;

import com.xadmin.swagger.model.Person;
import com.xadmin.swagger.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {


    @Autowired
    private PersonService service;

    @Operation(summary="Enter your details")
    @PostMapping("/save")
    public String savePerson(@RequestBody Person person){
        return service.savePerson(person);
}
@GetMapping("/getPerson")
    public List<Person> getAllPerson(){
        return service.getAllPerson();
}

@DeleteMapping("/deletePerson/{personId}")
    public List<Person> deletePersonById (@PathVariable int personId ){
        return service.deletePersonById(personId);
}





}
