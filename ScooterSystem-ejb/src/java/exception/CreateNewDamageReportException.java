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
public class CreateNewDamageReportException extends Exception {

    /**
     * Creates a new instance of <code>CreateNewDamageReportException</code>
     * without detail message.
     */
    public CreateNewDamageReportException() {
    }

    /**
     * Constructs an instance of <code>CreateNewDamageReportException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public CreateNewDamageReportException(String msg) {
        super(msg);
    }
}
