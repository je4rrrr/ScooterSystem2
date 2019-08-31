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
public class CreateTestEntityException extends Exception {

    /**
     * Creates a new instance of <code>CreateTestEntityException</code> without
     * detail message.
     */
    public CreateTestEntityException() {
    }

    /**
     * Constructs an instance of <code>CreateTestEntityException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CreateTestEntityException(String msg) {
        super(msg);
    }
}
