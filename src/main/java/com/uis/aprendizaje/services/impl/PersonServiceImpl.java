package com.uis.aprendizaje.services.impl;

import com.uis.aprendizaje.model.Person;
import com.uis.aprendizaje.services.interfaces.IPersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private List<String> persons = new ArrayList<String>();
    public String addPerson(String nombre, String direccion) {
        this.persons.add(nombre + "-" + direccion);
        return "Person " + nombre + "-" + direccion + " added";
    }

    public List<String> getPersons() {
        return this.persons;
    }
}
