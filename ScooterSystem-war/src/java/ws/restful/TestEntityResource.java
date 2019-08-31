/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.restful;

import java.util.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import ws.restful.datamodel.ErrorRsp;
import ws.restful.datamodel.GetTestEntityRsp;

/**
 * REST Web Service
 *
 * @author user
 */
@Path("TestEntity")
public class TestEntityResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TestEntityResource
     */
    public TestEntityResource() {
    }

    /**
     * Retrieves representation of an instance of ws.restful.TestEntityResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTestEntity() {
        try {
            GetTestEntityRsp getTestEntityRsp = new GetTestEntityRsp(new Date().toString());
            return Response.status(Status.OK).entity(getTestEntityRsp).build();
        } catch(Exception ex){
            ErrorRsp errorRsp = new ErrorRsp(ex.getMessage());
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorRsp).build();
                    
        }
    }

}
