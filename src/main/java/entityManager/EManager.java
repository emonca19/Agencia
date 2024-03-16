package entityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EManager {
    
     public EntityManager em() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("agenciatransito");
        EntityManager em = emf.createEntityManager();

        return em;
     }

}
