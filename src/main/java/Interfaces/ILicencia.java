/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.LicenciaEntidad;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author elimo
 */
public interface ILicencia {
    
    void guardarLicenciaBD(LicenciaEntidad licencia);
    
    
    List<LicenciaEntidad> buscarLicenciasPorNombre(String nombre);
    List<LicenciaEntidad> buscarLicenciaPorCURP(String curp);
    List<LicenciaEntidad> buscarLicenciasPorFechaNacimiento(Calendar fechaNacimiento);
    List<LicenciaEntidad> obtenerTodasLasLicencias();
    
}
