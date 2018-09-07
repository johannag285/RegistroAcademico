
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

/**
 * Clase encargada de modelar la tabla estudiante
 *
 * @author Daniela CH
 */
@Entity(name = "Estudiante")
public class EstudianteEntity implements Serializable {

    /**
     * Llave primaria de la tabla estudiante
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_estudiante;

    @ManyToOne
    @JoinColumn(name = "persona_id_fk")
    private PersonaEntity PERSONA_id;

    @ManyToOne
    @JoinColumn(name = "programa_id_fk")
    private ProgramaEntity PROGRAMA_id;

    /**
     * Atributo que hace referencia a la columna del código del estudiante
     */
    @Column
    private String cod_estudiante;

    /**
     * Constructor de Estudiante entity
     */
    public EstudianteEntity() {
    }

    /*Metodos get y set */
    public Long getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public PersonaEntity getPERSONA_id() {
        return PERSONA_id;
    }

    public void setPERSONA_id(PersonaEntity PERSONA_id) {
        this.PERSONA_id = PERSONA_id;
    }

    public ProgramaEntity getPROGRAMA_id() {
        return PROGRAMA_id;
    }

    public void setPROGRAMA_id(ProgramaEntity PROGRAMA_id) {
        this.PROGRAMA_id = PROGRAMA_id;
    }

    public String getCod_estudiante() {
        return cod_estudiante;
    }

    public void setCod_estudiante(String cod_estudiante) {
        this.cod_estudiante = cod_estudiante;
    }

}
