/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package klyeyecare.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Persistence;
import klyeyecare.model.Frame;

/**
 *
 * @author Yourainne
 */
public class FrameController implements Serializable {

    private final String persistentUnitName = "kly-eyecare_KlyLabel_jar_1.0-SNAPSHOTPU";

    public FrameController() {
        this.emf = Persistence.createEntityManagerFactory(persistentUnitName);
    }

    public FrameController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<Frame> findFrame() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("findFrame");
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Frame findFrameById(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Frame.class, id);
        } finally {
            em.close();
        }
    }

}
