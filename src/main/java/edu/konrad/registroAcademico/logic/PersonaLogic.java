/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.registroAcademico.logic;

import com.oracle.jrockit.jfr.Producer;
import edu.konrad.registroAcademico.entities.PersonaEntity;
import edu.konrad.registroAcademico.persistence.PersonaPersistence;
import java.util.List;
import javax.inject.Inject;

/**
 *Lógica del negocio Persona
 * @author johanna
 */
public class PersonaLogic {
    
    @Inject
    private PersonaPersistence personaPersistence;
    
     /**
      * Obtener el listado de personas 
      * @return personas
      */
    
    public List<PersonaEntity> getPersonas(){
        List<PersonaEntity> personas = personaPersistence.findAll();
        return personas;
    }
    
     /**
      * Obtener una persona a traves de su Id
      * @param Id
      * @return 
      */
    
    public PersonaEntity getPersona (Long Id){
        PersonaEntity persona = personaPersistence.find(Id);
        if (persona == null){
            throw new IllegalArgumentException("La persona que busca no existe");
        }
        return persona;
    }
     /**
      * Crear una nueva persona 
      * @param personaEntity
      * @return 
      */
    
    public PersonaEntity createPersona(PersonaEntity personaEntity){
        personaPersistence.create(personaEntity);
        return personaEntity;
    }
     /**
      * Actualizar persona
      * @param id
      * @param personaEntity
      * @return 
      */
    
    public PersonaEntity update(Long id, PersonaEntity personaEntity){
        PersonaEntity persona = personaPersistence.update(personaEntity);
        return persona;
    }
     /**
      * Eliminar Persona por su Id
      * @param id 
      */
    public void deletePersona(Long id){
        personaPersistence.remove(id);
    }
}
