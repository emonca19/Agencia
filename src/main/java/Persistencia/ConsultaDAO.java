package Persistencia;

import DTO.PersonaGeneradaDTO;
import DTO.PersonaNuevaDTO;
import Entidades.LicenciaEntidad;
import Entidades.PlacaEntidad;
import Interfaces.IConsultas;
import java.util.List;

public class ConsultaDAO implements IConsultas{

    @Override
    public List<LicenciaEntidad> buscarLicenciasPorCriterios(PersonaNuevaDTO pacienteNuevoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PlacaEntidad> buscarPlacasPorCriterios(PersonaNuevaDTO personaNuevoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
