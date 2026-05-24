package com.Quizz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Quizz.model.Option;

public interface OptionRepository
        extends JpaRepository<Option, Integer> {

    List<Option> findByQuestionId(Integer questionId);
}



//package com.Quizz.repository;
//
//import java.util.List;
//
//import com.Quizz.model.Option;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.TypedQuery;
//
//public class OptionRepository {
//
//    private static final EntityManagerFactory emf =
//            Persistence.createEntityManagerFactory("quiz-pu");
//
//    // Save Option
//    public void save(Option option) {
//
//        EntityManager em = emf.createEntityManager();
//
//        try {
//            em.getTransaction().begin();
//
//            em.persist(option);
//
//            em.getTransaction().commit();
//
//        } catch (Exception e) {
//
//            em.getTransaction().rollback();
//            e.printStackTrace();
//
//        } finally {
//            em.close();
//        }
//    }
//
//    // Find By Id
//    public Option findById(Integer id) {
//
//        EntityManager em = emf.createEntityManager();
//
//        try {
//            return em.find(Option.class, id);
//
//        } finally {
//            em.close();
//        }
//    }
//
//    // Get All Options
//    public List<Option> findAll() {
//
//        EntityManager em = emf.createEntityManager();
//
//        try {
//
//            TypedQuery<Option> query =
//                    em.createQuery("SELECT o FROM Option o", Option.class);
//
//            return query.getResultList();
//
//        } finally {
//            em.close();
//        }
//    }
//
//    // Update Option
//    public void update(Option option) {
//
//        EntityManager em = emf.createEntityManager();
//
//        try {
//
//            em.getTransaction().begin();
//
//            em.merge(option);
//
//            em.getTransaction().commit();
//
//        } catch (Exception e) {
//
//            em.getTransaction().rollback();
//            e.printStackTrace();
//
//        } finally {
//            em.close();
//        }
//    }
//
//    // Delete Option
//    public void delete(Integer id) {
//
//        EntityManager em = emf.createEntityManager();
//
//        try {
//
//            em.getTransaction().begin();
//
//            Option option = em.find(Option.class, id);
//
//            if (option != null) {
//                em.remove(option);
//            }
//
//            em.getTransaction().commit();
//
//        } catch (Exception e) {
//
//            em.getTransaction().rollback();
//            e.printStackTrace();
//
//        } finally {
//            em.close();
//        }
//    }
//
//    // Get Options By Question Id
//    public List<Option> findByQuestionId(Integer questionId) {
//
//        EntityManager em = emf.createEntityManager();
//
//        try {
//
//            TypedQuery<Option> query = em.createQuery(
//                    "SELECT o FROM Option o WHERE o.question.id = :qid",
//                    Option.class);
//
//            query.setParameter("qid", questionId);
//
//            return query.getResultList();
//
//        } finally {
//            em.close();
//        }
//    }
//}
