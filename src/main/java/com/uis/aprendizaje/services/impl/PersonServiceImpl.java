package com.uis.aprendizaje.services.impl;

import com.uis.aprendizaje.dto.PersonDTO;
import com.uis.aprendizaje.model.Person;
import com.uis.aprendizaje.repository.IpersonRepository;
import com.uis.aprendizaje.services.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private IpersonRepository ipersonRepository;

    @Override
    public Person addPerson(PersonDTO aPersonDTO) {
        Person person = new Person();
        person.setId(aPersonDTO.getId());
        person.setNombre(aPersonDTO.getNombre());
        person.setDireccion(aPersonDTO.getDireccion());
        return this.ipersonRepository.save(person);
    }

    @Override
    public Person getPerson(Long id) {
        return this.ipersonRepository.findById(id).orElse(null);

    }

    @Override
    public Boolean deletePerson(Long id) {
        this.ipersonRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Person> getAllPersons() {
        return this.ipersonRepository.findAll();
    }

    @Autowired
    public void setIpersonRepository(IpersonRepository ipersonRepository) {
        this.ipersonRepository = ipersonRepository;
    }
}
