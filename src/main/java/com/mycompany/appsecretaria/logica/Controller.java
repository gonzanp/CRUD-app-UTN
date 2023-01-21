
package com.mycompany.appsecretaria.logica;

import com.mycompany.appsecretaria.persistencia.ControllerPersistence;
import java.util.List;

public class Controller {
    
    ControllerPersistence controlPersis = new ControllerPersistence();

    public void save(String nombreAlu, String apellidoAlu, String telefonoAlu, String correoAlu, String linkedInAlu, String observacionesAlu, String carreraAlu, String trabajoAlu) {
        
        ///creo el alumno y asigno sus valores
        
        Alumno alu = new Alumno();
        alu.setNombre(nombreAlu);
        alu.setApellido(apellidoAlu);
        alu.setTelefono(telefonoAlu);
        alu.setCorreo(correoAlu);
        alu.setLinkedIn(linkedInAlu);
        alu.setObservaciones(observacionesAlu);
        alu.setCarrera(carreraAlu);
        alu.setTrabajo(trabajoAlu);
        
        controlPersis.save(alu);
        
        
    }
    public List<Alumno> traerDatos(){
        
        return controlPersis.traerDatos();
    }
}
