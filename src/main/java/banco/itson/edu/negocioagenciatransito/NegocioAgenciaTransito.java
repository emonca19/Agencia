/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package banco.itson.edu.negocioagenciatransito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import negocio.PersonaConsulta;

/**
 *
 * @author elimo
 */
public class NegocioAgenciaTransito {

    public static void main(String[] args) {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("agenciatransito");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        PersonaConsulta personaConsulta = new  PersonaConsulta();
        personaConsulta.agregarMasivoPersonas();
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
}
