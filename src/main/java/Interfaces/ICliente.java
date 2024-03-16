/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import DTO.ClienteDTO;
import Entidades.PersonaEntidad;

/**
 *
 * @author PC
 */
public interface ICliente {
    
    public PersonaEntidad agregarCliente(PersonaEntidad clienteEntidad);
    
    public ClienteDTO buscarPorId(Long id);
    
    
}
