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
public class ScooterNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>ScooterNotFoundException</code> without
     * detail message.
     */
    public ScooterNotFoundException() {
    }

    /**
     * Constructs an instance of <code>ScooterNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ScooterNotFoundException(String msg) {
        super(msg);
    }
}
