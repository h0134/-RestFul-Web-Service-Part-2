package com.xadmin.swagger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private int personId;
    private String personname;
    private  String position;
    private double salary;

    public Person() {
    }

    public Person(int personId, String personname, String position, double salary) {
        this.personId = personId;
        this.personname = personname;
        this.position = position;
        this.salary = salary;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
