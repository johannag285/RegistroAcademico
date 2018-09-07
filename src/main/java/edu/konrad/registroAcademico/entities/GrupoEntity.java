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
 * Clase encargada de modelar la tabla grupo
 *
 * @author Daniela CH
 */
@Entity(name = "Grupo")
public class GrupoEntity implements Serializable {

    /**
     * Llave primaria de la tabla grupo
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_grupo;

    @ManyToOne
    @JoinColumn(name = "curso_id_fk")
    private CursoEntity curso_id;

    @ManyToOne
    @JoinColumn(name = "profesor_id_fk")
    private ProfesorEntity profesor_id;

    /**
     * Atributo que hace referencia a la columna de la cantidad de inscritos
     */
    @Column
    private long cantidad_inscritos;

    /**
     * Constructor de Grupo entity
     */
    public GrupoEntity() {
    }

    /*Metodos get y set*/
    public long getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(Long id_grupo) {
        this.id_grupo = id_grupo;
    }

    public CursoEntity getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(CursoEntity curso_id) {
        this.curso_id = curso_id;
    }

    public ProfesorEntity getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(ProfesorEntity profesor_id) {
        this.profesor_id = profesor_id;
    }

    public long getCantidad_inscritos() {
        return cantidad_inscritos;
    }

    public void setCantidad_inscritos(int cantidad_inscritos) {
        this.cantidad_inscritos = cantidad_inscritos;
    }

}
