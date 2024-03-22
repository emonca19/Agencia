/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Interfaces.IConexionBD;
import Interfaces.IPersistir;
import excepciones.PersistenciaException;
import java.awt.BorderLayout;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author PC
 */
public class Persistir implements IPersistir{
    
    private final IConexionBD conexionBD;
    private final EntityManager entityManager;
    
    public Persistir() throws SQLException{
        
        conexionBD = new ConexionBD();
        entityManager = conexionBD.crearConexion();
        
    }
    
    @Override
    public <Entidad> boolean persistirEntidad(Entidad entidad) throws PersistenciaException{
        
        EntityTransaction transaction = null;
        
        try {
            
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(entidad);

            transaction.commit();
            
            return true;
            
        } catch (PersistenciaException e) {
            
            

            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            
            throw new PersistenciaException("No se logró persistir correctamente\n" + e);
        
        }
        
    }
    
}
