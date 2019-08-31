/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.TestEntity;
import exception.CreateTestEntityException;
import exception.TestEntityNotFoundException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class TestEntityController implements TestEntityControllerLocal {

    @PersistenceContext(unitName = "ScooterSystem-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    @Override
    public TestEntity createNewTestEntity (TestEntity testEntity) throws CreateTestEntityException{
        try{
            em.persist(testEntity);
            //add new scooter to warehouse!!
            return testEntity;
        }
        catch (Exception ex) {
            System.out.println("persistence exception thrown in createNewTestEntity");
            throw new CreateTestEntityException("persistence exception thrown in createNewTestEntity");
        }
    }
    
    @Override
    public TestEntity retrieveTestEntityById(Long testEntityId) throws TestEntityNotFoundException {
        TestEntity testEntity = em.find(TestEntity.class, testEntityId);
        if (testEntity != null) {
            return testEntity;
        } else {
            throw new TestEntityNotFoundException("Test Entity with id " + testEntityId + " does not exist");
        }
    }
    
    @Override
    public TestEntity updateTestEntity(TestEntity newTestEntity) throws TestEntityNotFoundException {
        
        
        TestEntity testEntityToUpdate = retrieveTestEntityById(newTestEntity.getTestEntityId());
        testEntityToUpdate.setUsername(newTestEntity.getUsername());


        
        return testEntityToUpdate;
    }
    
    @Override
    public void deleteTestEntity(Long testEntityId) throws TestEntityNotFoundException {
        
        TestEntity testEntity = retrieveTestEntityById(testEntityId);
        em.remove(testEntity);
    }
    
    @Override
    public String returnString() {
        
        return "test test";
    }
}
