/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import DTO.PersonaNuevaDTO;
import Entidades.PersonaEntidad;
import DAOS.IConexionBD;
import excepciones.PersistenciaException;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import DAOS.IPersonaDAO;

/**
 *
 * @author PC
 */
public class PersonaDAO implements IPersonaDAO {

    private final IConexionBD conexionBD = new ConexionBD();
    private EntityManager entityManager;

    public PersonaDAO() {
        try {

            entityManager = conexionBD.crearConexion();
        } catch (SQLException ex) {

            ex.printStackTrace();

        }
    }

    @Override
    public PersonaEntidad agregarPersona(PersonaEntidad personaEntidad) {

         try {
            entityManager.getTransaction().begin();
            entityManager.persist(personaEntidad);
            entityManager.getTransaction().commit();

        } catch (PersistenciaException e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
        return null;

    }

    @Override
    public PersonaEntidad buscarPorId(Long id) {
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<PersonaEntidad> query = criteriaBuilder.createQuery(PersonaEntidad.class);
            Root<PersonaEntidad> root = query.from(PersonaEntidad.class);

            query.select(root).where(criteriaBuilder.equal(root.get("idPersona"), id));

            return entityManager.createQuery(query).getSingleResult();
        } catch (PersistenciaException ex) {

            ex.printStackTrace();

        }
        return null;

    }

    @Override
    public List<PersonaEntidad> buscarPorNombre(String nombre) {
    
        CriteriaBuilder criteria = entityManager.getCriteriaBuilder();
        CriteriaQuery<PersonaEntidad> consulta = criteria.createQuery(PersonaEntidad.class);
        Root<PersonaEntidad> root = consulta.from(PersonaEntidad.class);
        consulta = consulta.select(root).where(criteria.like(root.get("nombres"), "%" + nombre + "%"));
        TypedQuery<PersonaEntidad> query = entityManager.createQuery(consulta);
        List<PersonaEntidad> listaPersonasPorNombre = query.getResultList();
        
        return listaPersonasPorNombre;
    
    }

    @Override
    public List<PersonaEntidad> listaPersonas() {
    
        CriteriaBuilder criteria = entityManager.getCriteriaBuilder();
        CriteriaQuery<PersonaEntidad> consulta = criteria.createQuery(PersonaEntidad.class);
        Root<PersonaEntidad> root = consulta.from(PersonaEntidad.class);
        TypedQuery<PersonaEntidad> query = entityManager.createQuery(consulta);
        List<PersonaEntidad> listaPersonas = query.getResultList();
        
        return listaPersonas;
        
    }
    
    
    
    

}
