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
 *Clase encargada de modelar la tabla Coordinador
 * @author Johanna G.
 */
@Entity (name="Coordinador" )
public class CoordinadorEntity  implements Serializable {
    /**
     * Llave priamria de la tabla Coordinador
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_coordinador;
    
    /**
     * Atributo que hace referencia a la columna del código del coordinador
     */
    @Column
    private String cod_coordinador;
    
    /**
     * Atributo que hace referencia a la llave foranea de la tabla Persona
     */
    @Column
    @OneToMany
    private Long persona_id;
    
    /**
     * Constructor de entidad de coordiandor
     */

    public CoordinadorEntity() {
    }
    
    
    
    
}
