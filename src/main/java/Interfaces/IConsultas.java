/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import DTO.ClienteDTO;
import Entidades.LicenciaEntidad;
import Entidades.PlacaEntidad;
import java.util.List;

/**
 *
 * @author elimo
 */
public interface IConsultas {
    
    List<LicenciaEntidad> buscarLicenciasPorCriterios(ClienteDTO cliente);
    
    List<PlacaEntidad> buscarPlacasPorCriterios(ClienteDTO cliente);
    
}
