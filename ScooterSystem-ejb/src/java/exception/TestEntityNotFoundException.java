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
public class TestEntityNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>TestEntityNotFoundException</code>
     * without detail message.
     */
    public TestEntityNotFoundException() {
    }

    /**
     * Constructs an instance of <code>TestEntityNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public TestEntityNotFoundException(String msg) {
        super(msg);
    }
}
