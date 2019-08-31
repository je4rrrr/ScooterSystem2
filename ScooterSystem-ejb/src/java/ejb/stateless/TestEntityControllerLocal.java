/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import entity.TestEntity;
import exception.CreateTestEntityException;
import exception.TestEntityNotFoundException;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface TestEntityControllerLocal {

    public TestEntity createNewTestEntity(TestEntity testEntity) throws CreateTestEntityException;

    public void deleteTestEntity(Long testEntityId) throws TestEntityNotFoundException;

    public TestEntity updateTestEntity(TestEntity newTestEntity) throws TestEntityNotFoundException;
    public TestEntity retrieveTestEntityById(Long testEntityId) throws TestEntityNotFoundException;

    public String returnString();
    
}
