/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.LicenciaEntidad;
import java.util.Date;
import java.util.List;

/**
 *
 * @author elimo
 */
public interface ILicencia {
    
    void guardarLicenciaBD(LicenciaEntidad licencia);
    
    LicenciaEntidad buscarLicenciaPorCURP(String curp);
    List<LicenciaEntidad> buscarLicenciasPorNombre(String nombre);
    List<LicenciaEntidad> buscarLicenciasPorFechaNacimiento(Date fechaNacimiento);
    List<LicenciaEntidad> obtenerTodasLasLicencias();
    
}
