package Persistencia;

import DTO.ClienteDTO;
import Entidades.LicenciaEntidad;
import Entidades.PlacaEntidad;
import Interfaces.IConsultas;
import java.util.List;

public class ConsultaDAO implements IConsultas{

    @Override
    public List<LicenciaEntidad> buscarLicenciasPorCriterios(ClienteDTO cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PlacaEntidad> buscarPlacasPorCriterios(ClienteDTO cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
