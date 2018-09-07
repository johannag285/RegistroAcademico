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
 * Clase encargada de modelar la tabla programa
 *
 * @author Daniela CH
 */
@Entity(name = "Programa")
public class ProgramaEntity implements Serializable {

    /**
     * Llave primaria de la tabla programa
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_programa;

    @ManyToOne
    @JoinColumn(name = "facultad_id_fk")
    private FacultadEntity FACULTAD_id;

    @ManyToOne
    @JoinColumn(name = "coordinador_id_fk")
    private CoordinadorEntity COORDINADOR_id;

    /**
     * Atributo que hace referencia a la columna del nombre del programa
     */
    @Column
    private String nom_programa;

    /**
     * Atributo que hace referencia a la columna del tipo del programa
     */
    @Column
    private String tipo_programa;

    /**
     * Atributo que hace referencia a la columna del nivel academico
     */
    @Column
    private String nivel_academico;

    /**
     * Constructor Programa entity
     */
    public ProgramaEntity() {
    }

    /* Metodos get y set*/
    
    public Long getId_programa() {
        return id_programa;
    }

    public void setId_programa(Long id_programa) {
        this.id_programa = id_programa;
    }

    public FacultadEntity getFACULTAD_id() {
        return FACULTAD_id;
    }

    public void setFACULTAD_id(FacultadEntity FACULTAD_id) {
        this.FACULTAD_id = FACULTAD_id;
    }

    public CoordinadorEntity getCOORDINADOR_id() {
        return COORDINADOR_id;
    }

    public void setCOORDINADOR_id(CoordinadorEntity COORDINADOR_id) {
        this.COORDINADOR_id = COORDINADOR_id;
    }

    public String getNom_programa() {
        return nom_programa;
    }

    public void setNom_programa(String nom_programa) {
        this.nom_programa = nom_programa;
    }

    public String getTipo_programa() {
        return tipo_programa;
    }

    public void setTipo_programa(String tipo_programa) {
        this.tipo_programa = tipo_programa;
    }

    public String getNivel_academico() {
        return nivel_academico;
    }

    public void setNivel_academico(String nivel_academico) {
        this.nivel_academico = nivel_academico;
    }

}
