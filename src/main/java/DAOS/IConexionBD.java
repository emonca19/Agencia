/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOS;

import java.sql.SQLException;
import javax.persistence.EntityManager;

/**
 *
 * @author PC
 */
public interface IConexionBD {
 
    public EntityManager crearConexion() throws SQLException;
    
}
