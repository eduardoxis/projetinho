
import model.Pagamento;

import jakarta.persistence.Entity;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pagamentoPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Pagamento pg = new Pagamento();

        pg.setValor(500);
        pg.setData(new Date());
        System.out.println(pg);

        entityManager.persist(pg);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        entityManager.close();


    }

}
