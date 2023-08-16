package io.zipcoder.crudapp;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;
@Entity
public class Person {


    String first_name;
    String last_name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;







}
