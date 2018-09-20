/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.registroAcademico.dto;

import edu.konrad.registroAcademico.entities.FacultadEntity;

/**
 *
 * @author Carlos David
 */
public class FacultadDTO {
    
    /**
     * Atributo que hace referencia al id del objeto Facultad
     */
    private Long id;
    
    /**
     * Atributo que hace referencia a la columna del nombre de la facultad.
     */
    private String nom_facultad;
    
    /**
     * Atributo que hace referencia a la columna del nivel academico de la facultad.
     */
    private String nivel_academico;
    
    /**
     * Constructor por defecto
     */
    public FacultadDTO() {
        
    }
    
    /**
      * mapeo de tabla a objeto
      * @param facultadEntity
      */
    public FacultadDTO(FacultadEntity facultadEntity){
        this.id = facultadEntity.getId_facultad();
        this.nom_facultad = facultadEntity.getNom_facultad();
        this.nivel_academico = facultadEntity.getNivel_academico();
    }
    
    /**
      * Mapeo de objeto a tabla
      * @return 
      */
    public FacultadEntity toEntity(){
       FacultadEntity entity = new  FacultadEntity();
       entity.setId_facultad(this.id);
       entity.setNom_facultad(this.nom_facultad);
       entity.setNivel_academico(this.nivel_academico);
       return entity;
    }
}
