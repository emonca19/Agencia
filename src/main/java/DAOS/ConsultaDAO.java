package DAOS;

import DTO.PersonaGeneradaDTO;
import DTO.PersonaNuevaDTO;
import Entidades.LicenciaEntidad;
import Entidades.PlacaEntidad;
import DAOS.IConsultas;
import java.util.List;

public class ConsultaDAO implements IConsultas{

    @Override
    public List<LicenciaEntidad> buscarLicenciasPorCriterios(LicenciaEntidad licenciaEntidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PlacaEntidad> buscarPlacasPorCriterios(PlacaEntidad placaEntidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
