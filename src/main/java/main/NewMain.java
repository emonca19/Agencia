/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidades.LicenciaEntidad;
import Entidades.PersonaEntidad;
import Entidades.PlacaEntidad;
import Entidades.TramiteEntidad;
import Entidades.VehiculoEntidad;
import Entidades.VehiculoTieneCliente;
import Interfaces.IConexionBD;
import Persistencia.ConexionBD;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.w3c.dom.ls.LSInput;

/**
 *
 * @author PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("agenciatransito");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(2004, 3, 9);
        PersonaEntidad persona = new PersonaEntidad("aaaa", fechaNacimiento, "aaaa", "aaaa", "aaaa", "aaaa", "aaaa");
        
        LicenciaEntidad licencia = new LicenciaEntidad(1, 1, 2000);
        licencia.setTipoTramite(1);
        Calendar fecha = Calendar.getInstance();
        fecha.set(2000, 1, 1);
        
        licencia.setCliente(persona);
        licencia.setFechaTramite(fecha);
        persona.setLicencia(licencia);
        VehiculoTieneCliente tiene = new VehiculoTieneCliente();
        tiene.setCliente(persona);
        
        VehiculoEntidad carro = new VehiculoEntidad("azul", "gtr", "nissan", "2000", 23322);
        tiene.setVehiculo(carro);
        
        List<VehiculoTieneCliente> listaTiene = new ArrayList<>();
        listaTiene.add(tiene);
        
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2024, 2, 2);
        PlacaEntidad placa = new  PlacaEntidad("1",  0, 0, fecha, fecha);
        placa.setFechaTramite(fecha);
        placa.setTipoTramite(2);
        List<PlacaEntidad> listaPLacas = new ArrayList<>();
        placa.setVehiculo(carro);
        listaPLacas.add(placa);
        
        persona.setVehiculoCliente(listaTiene);
        carro.setVehiculoCliente(listaTiene);
        carro.setPlaca(listaPLacas);
        List<TramiteEntidad> listatramites = new ArrayList<>();
        persona.setTramites(listatramites);
        
        em.persist(persona);
        
        em.getTransaction().commit();
        
        
    }
    
}
