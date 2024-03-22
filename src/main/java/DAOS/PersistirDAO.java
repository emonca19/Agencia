/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import DAOS.IConexionBD;
import excepciones.PersistenciaException;
import java.awt.BorderLayout;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import DAOS.IPersistirDAO;

/**
 *
 * @author PC
 */
public class PersistirDAO implements IPersistirDAO{
    
    private final IConexionBD conexionBD;
    private final EntityManager entityManager;
    
    public PersistirDAO() throws SQLException{
        
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
