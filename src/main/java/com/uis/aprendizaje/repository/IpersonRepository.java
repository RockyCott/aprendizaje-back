package com.uis.aprendizaje.repository;

import com.uis.aprendizaje.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IpersonRepository extends JpaRepository<Person, Long> {

}
