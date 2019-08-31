/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.TransportVehicle;
import exception.CreateNewTransportVehicleException;
import exception.TransportVehicleNotFoundException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class TransportVehicleController implements TransportVehicleControllerLocal {

    @PersistenceContext(unitName = "ScooterSystem-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    @Override
    public TransportVehicle createNewTransportVehicle (TransportVehicle transportVehicle) throws CreateNewTransportVehicleException{
        try{
            em.persist(transportVehicle);
            //add new scooter to warehouse!!
            return transportVehicle;
        }
        catch (Exception ex) {
            System.out.println("persistence exception thrown in createNewTransportVehicle");
            throw new CreateNewTransportVehicleException("persistence exception thrown in createNewTransportVehicle");
        }
    }
    
    @Override
    public TransportVehicle retrieveTransportVehicleById(Long transportVehicleId) throws TransportVehicleNotFoundException {
        TransportVehicle transportVehicle = em.find(TransportVehicle.class, transportVehicleId);
        if (transportVehicle != null) {
            transportVehicle.getPickupTransactions().size();
            return transportVehicle;
        } else {
            throw new TransportVehicleNotFoundException("Transport Vehicle with id " + transportVehicleId + " does not exist");
        }
    }
    
    @Override
    public TransportVehicle updateTransportVehicle(TransportVehicle newTransportVehicle) throws TransportVehicleNotFoundException {
        
        
        TransportVehicle transportVehicleToUpdate = retrieveTransportVehicleById(newTransportVehicle.getTransportVehicleId());
        transportVehicleToUpdate.setPickupTransactions(newTransportVehicle.getPickupTransactions());
        transportVehicleToUpdate.setCapacity(newTransportVehicle.getCapacity());
        transportVehicleToUpdate.setRegistrationNum(newTransportVehicle.getRegistrationNum());  
        
        return transportVehicleToUpdate;
    }
    
    @Override
    public void deleteTransportVehicle(Long transportVehicleId) throws TransportVehicleNotFoundException {
        
        TransportVehicle transportVehicle = retrieveTransportVehicleById(transportVehicleId);
        em.remove(transportVehicle);
    }
    

}
