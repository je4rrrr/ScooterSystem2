/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.Employee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lilith
 */
@Local
public interface EmployeeControllerLocal {

    public void foo();

    public List<Employee> findAllEmployee();
    
    public String returnString();
    
    
}
