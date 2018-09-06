/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.registroAcademico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Carlos David
 */
@Entity (name = "Horario")
public class HorarioEntity {
    
    /**
     * Llave primaria de la tabla Horario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_horario;
    
    /**
     * Atributo de la tabla Horario que hace referencia al dia del horario.
     */
    @Column
    private String dia_horario;
    
    /**
     * Atributo de la tabla Horario que hace referencia a la hora que inicia una clase.
     */
    @Column
    private long inicio_clase;
    
    /**
     * Atributo de la tabla Horario que hace referencia a la hora que termina una clase
     */
    @Column
    private long fin_clase;
    
    /**
     * Atributo de la tabla Horario que hace referencia a el salon donde se dictará la clase.
     */
    @Column
    private String salon_clase;
    
    /**
     * Atributo de la tabla Horario que hace referencia a la llave foranea que conecta con la tabla Grupo.
     */
    @Column
    @OneToMany
    private long GRUPO_id_fk;
}
