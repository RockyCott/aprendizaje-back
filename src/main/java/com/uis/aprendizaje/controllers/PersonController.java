package com.uis.aprendizaje.controllers;

import com.uis.aprendizaje.services.impl.PersonServiceImpl;
import com.uis.aprendizaje.services.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService iPersonService;
    @PostMapping("/add-person")
    public String addPerson(@RequestParam("nombre") String nombre, @RequestParam String direccion) {

        return this.iPersonService.addPerson(nombre, direccion);
    }

    @GetMapping("/get-persons")
    public List<String> getPersons() {
        return this.iPersonService.getPersons();
    }
}