package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;


    @PostMapping("/people")
    public Person createPerson(Person p)
    {
        personRepository.save(p);
        return p;

    }
    @GetMapping("/people")
    public Person getPerson(Long id)
    {
       return personRepository.findOne(id);
    }

    @GetMapping("people/{id}")
    public List<Person> getPersonList()
    {
        return personRepository.findAll();
    }

    @PutMapping("/people/{id}")
    public Person updatePerson(Person p)
    {
        return null;
    }

    @DeleteMapping("/people/{id}")
    public void DeletePerson(Long id)
    {
    personRepository.delete(id);
    }


}
