package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAll();
    Person findOne(Long id);
    Person save(Person p );
    void delete(Long id);









}
