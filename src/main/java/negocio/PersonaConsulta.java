/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAOS.IPersonaDAO;
import DAOS.PersonaDAO;
import DTO.PersonaGeneradaDTO;
import DTO.PersonaNuevaDTO;
import Entidades.PersonaEntidad;
import java.util.List;
import modificadores.Convertidor;

/**
 *
 * @author PC
 */
public class PersonaConsulta {
    
    private final IPersonaDAO personaDAO;
    
    public PersonaConsulta(){
        
        personaDAO = new PersonaDAO();
    
    }
    
    /**
     * Metodo que llama a persistencia por una lista de las entidades persona
     * @return listaPersona
     */
    public List<PersonaEntidad> listaPersonas(){
        
        List<PersonaEntidad> listaPersonas = personaDAO.listaPersonas();
        
        return listaPersonas;
        
    }
    
    /**
     * Metodo que regresa una lista con las personas que coincidan con el nombre
     * @param nombres
     * @return listaPersonasNombre
     */
    public List<PersonaEntidad> listaPersonasNombre(String nombres){
        
        List<PersonaEntidad> listaPersonasNombre = personaDAO.buscarPorNombre(nombres);
        
        return listaPersonasNombre;
        
    }
    
    /**
     * Metodo que regresa un dto de una persona buscada por su id
     * @param id
     * @return personaGeneradaDTO
     */
    public PersonaGeneradaDTO personaPorID(Long id){
        
        PersonaEntidad personaEntidad = personaDAO.buscarPorId(id);

        Convertidor convertidor = new Convertidor();

        PersonaGeneradaDTO personaGeneradaDTO = convertidor.entityToDTO(personaEntidad, new PersonaGeneradaDTO());
        return personaGeneradaDTO;
       
    }
    
    /**
     * Metodo que regresa un dto que fue enviado a persistir
     * @param personaNuevaDTO
     * @return personaGeneradaDTO
     */
    public PersonaGeneradaDTO agregarPersona(PersonaNuevaDTO personaNuevaDTO){
        
        Convertidor convertidor = new Convertidor();
        PersonaEntidad personaEntidad = convertidor.DTOToEntidad(personaNuevaDTO, new PersonaEntidad());
        personaEntidad = personaDAO.agregarPersona(personaEntidad);
        PersonaGeneradaDTO personaGeneradaDTO = convertidor.entityToDTO(personaEntidad, new PersonaGeneradaDTO());
        return personaGeneradaDTO;
        
    }
    
}
