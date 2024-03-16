package Persistencia;

import Entidades.LicenciaEntidad;
import Interfaces.ILicencia;
import entityManager.EManager;
import excepciones.PersistenciaException;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class LicenciaDAO extends PersistenciaException implements ILicencia {
    private EManager emanager;
    EntityManager em = emanager.em();
    

    @Override
    public LicenciaEntidad buscarLicenciaPorCURP(String curp) {

        return null;

    }

    @Override
    public List<LicenciaEntidad> buscarLicenciasPorNombre(String nombre) {


        try {
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<LicenciaEntidad> criteriaQuery = criteriaBuilder.createQuery(LicenciaEntidad.class);
            Root<LicenciaEntidad> root = criteriaQuery.from(LicenciaEntidad.class);

            Predicate predicate = criteriaBuilder.equal(root.get("nombre"), nombre);

            criteriaQuery.where(predicate);
            return em.createQuery(criteriaQuery).getResultList();

        } catch (PersistenciaException es) {
            es.printStackTrace();
        }
        return null;

    }

    @Override
    public List<LicenciaEntidad> buscarLicenciasPorFechaNacimiento(Date fechaNacimiento) {

        return null;

    }

    @Override
    public List<LicenciaEntidad> obtenerTodasLasLicencias() {

        return null;

    }

    @Override
    public void guardarLicenciaBD(LicenciaEntidad licencia) {
        

        try {
            em.getTransaction().begin();
            em.persist(licencia);
            em.getTransaction().commit();

        } catch (PersistenciaException e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}


