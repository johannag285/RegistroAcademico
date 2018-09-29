/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.konrad.registroAcademico.resources;


import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Clase para el registro de recursos
 * @author johanna
 */

@ApplicationPath("/api")
public class ApplicationConfig  extends Application{
    
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet<Class<?>>();
        return resources;
    }
    
    private void addResourcesClasses(Set<Class<?>> resources){
        resources.add(PersonaResources.class);
        resources.add(CoordinadorResources.class);
        resources.add(CursoResources.class);
    }
}
