package edu.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.neo.entity.PersonaEntity;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Integer>  {

}
