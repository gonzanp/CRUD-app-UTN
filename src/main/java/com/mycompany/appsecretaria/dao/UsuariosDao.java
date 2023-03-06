
package com.mycompany.appsecretaria.dao;

import com.mycompany.appsecretaria.logica.Usuarios;
import com.mycompany.appsecretaria.persistencia.UsuariosJpaController;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class UsuariosDao {
    
    private Usuarios user = new Usuarios();
    private UsuariosJpaController ujc = new UsuariosJpaController();
    
    
    public boolean Login(String user, String password){
        EntityManager em = ujc.getEntityManager();
        boolean valor;

        try{
            Query query = em.createQuery("SELECT u.user , u.password FROM Usuarios u WHERE u.user = :user AND u.password = :password ");
            query.setParameter("user", user);
            query.setParameter("password", password);
            List resultado = query.getResultList();
            if(!resultado.isEmpty() ){
                valor = true;
            }else{
                valor = false;
            }
            
        }catch(Exception e){
            valor = false;
            
        }
        return valor;
    }
    
}
