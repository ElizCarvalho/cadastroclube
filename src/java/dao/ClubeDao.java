/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.MyEntityManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Clube;

/**
 *
 * @author DesenvolvedorJava
 */
public class ClubeDao {
    
    private EntityManager em = MyEntityManager.getEntityManager();
    
    public void gravarClube(Clube c){
        
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroDeClubesPU");
        //        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        
    }
    
        public List<Clube> consultarTodosClubes(){
        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroDeClubesPU");
//        EntityManager em = emf.createEntityManager();
  
        em.getTransaction().begin();
        Query q = em.createNamedQuery("consultaListaClubes");
        List<Clube> todosClubes = q.getResultList();
        return todosClubes;
    }
   
        public void excluirClube(Clube c){
            
            em.getTransaction().begin();
            Clube cAux = em.find(Clube.class, c.getIdclube()); //precisa pegar o objeto e vincular ao objeto do BD
            em.remove(cAux); // como Caux esta vinculado ao contexto de persistencia entao posso excluir 
            em.getTransaction().commit();
            
        }
}
