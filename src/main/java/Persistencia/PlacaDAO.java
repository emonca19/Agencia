package Persistencia;

import Entidades.PlacaEntidad;
import Entidades.VehiculoEntidad;
import Interfaces.IPlaca;
import java.util.List;

public class PlacaDAO implements IPlaca{

    @Override
    public void guardarPlaca(PlacaEntidad placa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PlacaEntidad buscarPlacaPorNumero(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PlacaEntidad> buscarPlacasPorAutomovil(VehiculoEntidad vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PlacaEntidad> obtenerTodasLasPlacas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
