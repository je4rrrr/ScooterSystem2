/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.Scooter;
import exception.CreateNewScooterException;
import exception.ScooterNotFoundException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author scooter
 */
@Stateless
public class ScooterController implements ScooterControllerLocal {

    @PersistenceContext(unitName = "ScooterSystem-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Scooter createNewScooter (Scooter scooter) throws CreateNewScooterException{
        try{
            em.persist(scooter);
            //add new scooter to warehouse!!
            return scooter;
        }
        catch (Exception ex) {
            System.out.println("persistence exception thrown in createNewScooter");
            throw new CreateNewScooterException("persistence exception thrown in createNewScooter");
        }
    }
    
    @Override
    public Scooter retrieveScooterById(Long scooterId) throws ScooterNotFoundException {
        Scooter scooter = em.find(Scooter.class, scooterId);
        if (scooter != null) {
            scooter.getDamageReports().size();
            scooter.getRentals().size();
            return scooter;
        } else {
            throw new ScooterNotFoundException("Scooter with id " + scooterId + " does not exist");
        }
    }
    
    @Override
    public Scooter updateScooter(Scooter newScooter) throws ScooterNotFoundException {
        
        
        Scooter scooterToUpdate = retrieveScooterById(newScooter.getScooterId());
        scooterToUpdate.setRentals(newScooter.getRentals());
        scooterToUpdate.setBatteryLevel(newScooter.getBatteryLevel());
        scooterToUpdate.setCoordinates(newScooter.getCoordinates());
        scooterToUpdate.setDamageReports(newScooter.getDamageReports());
        scooterToUpdate.setLastParkedAt(newScooter.getLastParkedAt());
        scooterToUpdate.setRegistrationNum(newScooter.getRegistrationNum());
        scooterToUpdate.setStatus(newScooter.getStatus());  
        
        return scooterToUpdate;
    }
    
    @Override
    public void deleteScooter(Long scooterId) throws ScooterNotFoundException {
        
        Scooter scooter = retrieveScooterById(scooterId);
        em.remove(scooter);
    }
    
    

     
}
