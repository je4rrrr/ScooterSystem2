/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.restful.datamodel;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */

@XmlType(name="getTestEntityRsp", propOrder={
    "testString"
})
public class GetTestEntityRsp {
    private String testString;
    
    
    public GetTestEntityRsp() {
    }
    
    public GetTestEntityRsp(String testString) {
        this.testString = testString;
    }

    /**
     * @return the testString
     */
    public String getTestString() {
        return testString;
    }

    /**
     * @param testString the testString to set
     */
    public void setTestString(String testString) {
        this.testString = testString;
    }
    
    
    
}
