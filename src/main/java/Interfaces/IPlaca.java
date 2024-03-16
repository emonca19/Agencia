/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.PlacaEntidad;
import Entidades.VehiculoEntidad;
import java.util.List;

/**
 *
 * @author elimo
 */
public interface IPlaca {
    
    void guardarPlaca(PlacaEntidad placa);
    
    PlacaEntidad buscarPlacaPorNumero(String numero);
    
    List<PlacaEntidad> buscarPlacasPorAutomovil(VehiculoEntidad vehiculo);
    
    List<PlacaEntidad> obtenerTodasLasPlacas();
    
}
