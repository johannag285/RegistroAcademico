/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.registroAcademico.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *Clase encargada de modelar la tabl curso
 * @author johannna
 */
@Entity (name = "Curso")
public class CursoEntity implements Serializable {
 /**
  * Llave primaria de la tabla persona
  */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_curso;
    
    /**
     * Atributo que hace referencia al nombre del curso
     */
    @Column
    private String nom_curso;
    
    /**
     * Atributo que hace referncia a lllave foranea del curso
     */
    @Column
    @OneToMany
    private Long PROGRAMA_id;
    
    /**
     * Atributo que hace referencia a la herencia entre programa y curso
     */
   // @JoinColumn
    //@ManyToOne 
    //private ProgramaEntity dato;

    /**
     * Contructor de entidad de curso
     */
    public CursoEntity() {
    }
    
    /**
     * Métodos set y get
     */
    public Long getId_curso() {
        return id_curso;
    }

    public void setId_curso(Long id_curso) {
        this.id_curso = id_curso;
    }

    public String getNom_curso() {
        return nom_curso;
    }

    public void setNom_curso(String nom_curso) {
        this.nom_curso = nom_curso;
    }

    public Long getPROGRAMA_id() {
        return PROGRAMA_id;
    }

    public void setPROGRAMA_id(Long PROGRAMA_id) {
        this.PROGRAMA_id = PROGRAMA_id;
    }
    
    
    
}
