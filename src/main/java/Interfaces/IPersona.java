/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import DTO.PersonaNuevaDTO;
import Entidades.PersonaEntidad;

/**
 *
 * @author PC
 */
public interface IPersona {
    
    public PersonaEntidad agregarPersona(PersonaNuevaDTO persona);
    
    public PersonaEntidad buscarPorId(Long id);
    
    
}
