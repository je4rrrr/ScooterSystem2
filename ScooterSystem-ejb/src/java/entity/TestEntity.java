/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lilith
 */
@Entity
public class TestEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testEntityId;
    private String username;
    
    public TestEntity() {
    }

    /**
     * @return the testEntityId
     */
    public Long getTestEntityId() {
        return testEntityId;
    }

    /**
     * @param testEntityId the testEntityId to set
     */
    public void setTestEntityId(Long testEntityId) {
        this.testEntityId = testEntityId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

   
}
