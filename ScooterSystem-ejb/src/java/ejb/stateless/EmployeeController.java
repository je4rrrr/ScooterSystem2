/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.Advertisement;
import entity.Employee;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Lilith
 */
@Stateless
public class EmployeeController implements EmployeeControllerLocal {

    @PersistenceContext(unitName = "ScooterSystem-ejbPU")
    private EntityManager em;
    

    public void persist(Object object) {
        em.persist(object);
    }
    
    public void foo() {
        Employee employee = new Employee();
        persist(employee);
        Advertisement ad = new Advertisement();
        persist(ad);
    }
    
    public Employee findById (Long employeeId) {
        Employee employee = em.find(Employee.class, employeeId);
        return employee;
    }
    
    public List<Employee> findAllEmployee () {
        Query query = em.createQuery("SELECT em from Employee em");
        List<Employee> employees = query.getResultList();
        
        return employees;
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public String returnString() {
        return "TEST TEST"; 
    }
}
