package com.uis.aprendizaje.services.interfaces;

import com.uis.aprendizaje.dto.PersonDTO;
import com.uis.aprendizaje.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonService {

    Person addPerson(PersonDTO aPersonDTO);

    Boolean deletePerson(Long id);

    Person getPerson(Long id);



    List<Person> getAllPersons();

}
