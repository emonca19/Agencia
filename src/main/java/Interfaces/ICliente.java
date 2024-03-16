/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import DTO.ClienteDTO;
import Entidades.ClienteEntidad;

/**
 *
 * @author PC
 */
public interface ICliente {
    
    public ClienteEntidad agregarCliente(ClienteEntidad clienteEntidad);
    
    public ClienteDTO buscarPorId(Long id);
    
    
}
