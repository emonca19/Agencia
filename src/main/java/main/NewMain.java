package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NewMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("agenciatransito");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

}
