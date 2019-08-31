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
public class CreateNewScooterException extends Exception {

    /**
     * Creates a new instance of <code>CreateNewUserException</code> without
     * detail message.
     */
    public CreateNewScooterException() {
    }

    /**
     * Constructs an instance of <code>CreateNewUserException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CreateNewScooterException(String msg) {
        super(msg);
    }
}
