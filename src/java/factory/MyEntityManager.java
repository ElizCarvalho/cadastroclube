/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManager {
 
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static EntityManager getEntityManager(){
        
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("CadastroDeClubesPU");
        }
        return emf.createEntityManager();
    }
    
}
