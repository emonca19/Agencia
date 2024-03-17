/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import DTO.PersonaNuevaDTO;
import Entidades.PersonaEntidad;
import Interfaces.IConexionBD;
import Interfaces.IPersona;
import excepciones.PersistenciaException;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author PC
 */
public class PersonaDAO implements IPersona {

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
    public PersonaEntidad agregarPersona(PersonaNuevaDTO persona) {

         try {
            entityManager.getTransaction().begin();
            entityManager.persist(persona);
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

}
