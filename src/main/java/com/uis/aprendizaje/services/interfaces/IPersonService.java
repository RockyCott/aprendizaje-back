package com.uis.aprendizaje.services.interfaces;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonService {

    String addPerson(String nombre, String direccion);

    List<String> getPersons();

}
