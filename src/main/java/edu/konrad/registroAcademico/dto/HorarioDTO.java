/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.registroAcademico.dto;

import edu.konrad.registroAcademico.entities.GrupoEntity;
import edu.konrad.registroAcademico.entities.HorarioEntity;

/**
 *
 * @author Carlos David
 */
public class HorarioDTO {
    
    /**
     * Atributo que hace referencia al id del objeto Horario
     */
    private Long id;
    
    /**
     * Atributo que hace referencia a la columna del dia de Horario
     */
    private String dia_horario;
    
    /**
     * Atributo que hace referencia a la columna del inicio de clase de Horario
     */
    private long inicio_clase;
    
    /**
     * Atributo que hace referencia a la columna delfin de clase de Horario
     */
    private long fin_clase;
    
    /**
     * Atributo que hace referencia a la columna del salon del Horario
     */
    private String salon_clase;
    
    /**
     * Atributo que hace referencia al id de grupo del horario
     */
    private GrupoEntity grupo_id;
    
    /**
      * mapeo de tabla a objeto
      * @param horarioEntity
      */
    public HorarioDTO(HorarioEntity horarioEntity){
        this.id = horarioEntity.getId_horario();
        this.dia_horario = horarioEntity.getDia_horario();
        this.inicio_clase = horarioEntity.getInicio_clase();
        this.fin_clase = horarioEntity.getFin_clase();
        this.salon_clase = horarioEntity.getSalon_clase();
    }
    
    /**
      * Mapeo de objeto a tabla
      * @return 
      */
    public HorarioEntity toEntity(){
       HorarioEntity entity = new  HorarioEntity();
       entity.setDia_horario(this.dia_horario);
       entity.setInicio_clase(this.inicio_clase);
       entity.setFin_clase(this.fin_clase);
       entity.setSalon_clase(this.salon_clase);
       return entity;
    }
}
