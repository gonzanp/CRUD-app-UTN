
package com.mycompany.appsecretaria.persistencia;

import com.mycompany.appsecretaria.logica.Alumno;
import java.util.List;

public class ControllerPersistence {
    
    AlumnoJpaController alumnoJpa = new AlumnoJpaController();
    public List<Alumno> traerDatos;
    
    public void save(Alumno alu){
        
        ///creo el alumno en base de datos
        alumnoJpa.create(alu);
    }
    
    public List<Alumno> traerDatos(){
        return alumnoJpa.findAlumnoEntities();
    }
}
