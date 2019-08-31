/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.Scooter;
import exception.CreateNewScooterException;
import exception.ScooterNotFoundException;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface ScooterControllerLocal {

    public Scooter createNewScooter(Scooter scooter) throws CreateNewScooterException;

    public Scooter retrieveScooterById(Long scooterId) throws ScooterNotFoundException;

    public Scooter updateScooter(Scooter newScooter) throws ScooterNotFoundException;

    public void deleteScooter(Long scooterId) throws ScooterNotFoundException;
    
}
