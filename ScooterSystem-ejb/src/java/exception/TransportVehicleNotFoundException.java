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
public class TransportVehicleNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>TransportVehicleNotFoundException</code>
     * without detail message.
     */
    public TransportVehicleNotFoundException() {
    }

    /**
     * Constructs an instance of <code>TransportVehicleNotFoundException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public TransportVehicleNotFoundException(String msg) {
        super(msg);
    }
}
