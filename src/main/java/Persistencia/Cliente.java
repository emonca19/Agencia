/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import DTO.ClienteDTO;
import Entidades.ClienteEntidad;
import Interfaces.ICliente;
import Interfaces.IConexionBD;
import java.sql.SQLException;
import javax.persistence.EntityManager;

/**
 *
 * @author PC
 */
public class Cliente implements ICliente{

    private IConexionBD conexionBD;
    private EntityManager entityManagaer;
    
    public Cliente() throws SQLException{
    
        conexionBD = new ConexionBD();
        entityManagaer = conexionBD.crearConexion();
        
    }
    
    @Override
    public ClienteDTO buscarPorId(Long id) {
    
        return null;
        
    }

    @Override
    public ClienteEntidad agregarCliente(ClienteEntidad clienteEntidad) {
    
        entityManagaer.getTransaction().begin();
        
        entityManagaer.persist(clienteEntidad);
        
        entityManagaer.getTransaction().commit();
        
        return clienteEntidad;
        
    }
    
    
    
}
