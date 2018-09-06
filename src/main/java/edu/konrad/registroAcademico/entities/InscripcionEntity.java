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
import javax.persistence.OneToMany;

/**
 *Clase encargada de de modelar la tabla Inscripcion
 * @author johanna
 */

@Entity (name = "Inscripcion")
public class InscripcionEntity implements Serializable {
    
    /**
     * Atributo que hace referencia a la llave primaria de la tabla Inscripcion
     */
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id_inscripcion;
    
    /**
     * Atributo que hace referencia al semestre de la tabla Inscripcion
     */
    @Column
    private Long semestre;
    /**
     * Atributo que hace referencia a la llave foranea de la tabla estudiante
     */
    @Column
    @OneToMany
    private Long ESTUDIANTE_id_fk;
    
    /**
     * Atributo que hace referencia a llave foranea de la tabla horario
     */
    @Column
    @OneToMany
    private Long HORARIO_id_fk;

     /**
     * Contructor de entidad de Inscripcion
     */
    public InscripcionEntity() {
    }
    
    
}
