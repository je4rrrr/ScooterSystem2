/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author user
 */
public class CreateNewTransportVehicleException extends Exception {

    /**
     * Creates a new instance of <code>CreateNewTransportVehicleException</code>
     * without detail message.
     */
    public CreateNewTransportVehicleException() {
    }

    /**
     * Constructs an instance of <code>CreateNewTransportVehicleException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public CreateNewTransportVehicleException(String msg) {
        super(msg);
    }
}
