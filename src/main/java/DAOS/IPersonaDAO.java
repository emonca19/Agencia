/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOS;

import DTO.PersonaNuevaDTO;
import Entidades.PersonaEntidad;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IPersonaDAO {
    
    public PersonaEntidad agregarPersona(PersonaNuevaDTO persona);
    
    public PersonaEntidad buscarPorId(Long id);
    
    public List<PersonaEntidad> buscarPorNombre(String nombre);
    
    public List<PersonaEntidad> listaPersonas();
    
}
