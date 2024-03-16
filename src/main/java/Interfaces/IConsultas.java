/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import DTO.PersonaNuevaDTO;
import Entidades.LicenciaEntidad;
import Entidades.PlacaEntidad;
import java.util.List;

/**
 *
 * @author elimo
 */
public interface IConsultas {
    
    List<LicenciaEntidad> buscarLicenciasPorCriterios(PersonaNuevaDTO pacienteNuevoDTO);
    
    List<PlacaEntidad> buscarPlacasPorCriterios(PersonaNuevaDTO personaNuevoDTO);
    
}
