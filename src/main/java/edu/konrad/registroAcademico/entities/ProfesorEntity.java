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
 *
 * @author Carlos David
 */

@Entity (name = "Profesor")
public class ProfesorEntity implements Serializable{

    /**
     * Llave primaria de la tabla Profesor.
     */ 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_profesor;

    /**
     * Atributo de la tabla Profesor que hace referencia al codigo del profesor.
     */
    @Column
    private String cod_profesor;
    
    /**
     * Atributo de la tabla Profesor que hace referencia a la llave foranea que conecta con la tabla Persona.
     */
    @Column
    @OneToMany
    private long PERSONA_id_fk;
    
    /**
     * Atributo de la tabla Profesor que hace referencia a la llave foranea que conecta con la tabla Programa.
     */
    @Column
    @OneToMany
    private long PROGRAMA_id_fk;
    
    /**
     * Atributo de la tabla Profesor que hace referencia al area de profundización del docente.
     */
    @Column
    private String area_profun;

    /**
     * Atributo que hace referencia que la tabla Profesor hereda de Persona.
     */
    @JoinColumn
    @ManyToOne
    private PersonaEntity dato;
    
    /**
     * Constructor de la tabla ProfesorEntity.
     */
    public ProfesorEntity(){
        
    }

    /**
     * Metodos Getters y Setters de la tabla Profesor.
     */
    public Long getId_profesor() {
        return id_profesor;
    }

    public String getCod_profesor() {
        return cod_profesor;
    }

    public long getPERSONA_id_fk() {
        return PERSONA_id_fk;
    }

    public long getPROGRAMA_id_fk() {
        return PROGRAMA_id_fk;
    }

    public String getArea_profun() {
        return area_profun;
    }

    public PersonaEntity getDato() {
        return dato;
    }

    public void setId_profesor(Long id_profesor) {
        this.id_profesor = id_profesor;
    }

    public void setCod_profesor(String cod_profesor) {
        this.cod_profesor = cod_profesor;
    }

    public void setPERSONA_id_fk(long PERSONA_id_fk) {
        this.PERSONA_id_fk = PERSONA_id_fk;
    }

    public void setPROGRAMA_id_fk(long PROGRAMA_id_fk) {
        this.PROGRAMA_id_fk = PROGRAMA_id_fk;
    }

    public void setArea_profun(String area_profun) {
        this.area_profun = area_profun;
    }

    public void setDato(PersonaEntity dato) {
        this.dato = dato;
    }
    
    
    
    
    
    
    
    
    
    
}
