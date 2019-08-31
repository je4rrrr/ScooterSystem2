/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.TransportVehicle;
import exception.CreateNewTransportVehicleException;
import exception.TransportVehicleNotFoundException;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface TransportVehicleControllerLocal {

    public TransportVehicle createNewTransportVehicle(TransportVehicle transportVehicle) throws CreateNewTransportVehicleException;

    public TransportVehicle retrieveTransportVehicleById(Long transportVehicleId) throws TransportVehicleNotFoundException;

    public TransportVehicle updateTransportVehicle(TransportVehicle newTransportVehicle) throws TransportVehicleNotFoundException;

    public void deleteTransportVehicle(Long transportVehicleId) throws TransportVehicleNotFoundException;
    
}
