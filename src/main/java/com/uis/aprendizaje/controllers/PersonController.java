package com.uis.aprendizaje.controllers;

import com.uis.aprendizaje.dto.PersonDTO;
import com.uis.aprendizaje.exceptions.customException;
import com.uis.aprendizaje.model.Person;
import com.uis.aprendizaje.services.impl.PersonServiceImpl;
import com.uis.aprendizaje.services.interfaces.IPersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    @PostMapping("/add-person")
    public Person addPerson(@Validated @RequestBody PersonDTO aPersonDTO) {
        return this.iPersonService.addPerson(aPersonDTO);
    }
    @GetMapping("/get-persons")
    public List<Person> getPersons() {
        return this.iPersonService.getAllPersons();
    }

    @PutMapping("/update-person")
    public Person updatePerson(@Validated @RequestBody PersonDTO aPersonDTO) {
        Person person = this.iPersonService.getPerson(aPersonDTO.getId());
        return this.iPersonService.addPerson(aPersonDTO);
    }

    @DeleteMapping("/delete-person/{id}")
    public Boolean deletePerson(@PathVariable("id") Long id) {
        return this.iPersonService.deletePerson(id);
    }
    @GetMapping("/get-person/{id}")
    public Person getPerson(@PathVariable("id") Long id) {
        return this.iPersonService.getPerson(id);
    }


}