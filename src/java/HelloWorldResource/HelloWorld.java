/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorldResource;

import javax.json.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * How to test?
 * localhost:8080/HelloWorldApp/api/rest/
 * localhost:8080/HelloWorldApp/api/rest/CustomName -> (Return html)
 * localhost:8080/HelloWorldApp/api/rest/:CustomName -> (Return json)
 * 
 * @author jaanacleto
 */
@Path("/rest")
public class HelloWorld {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloWorld
     */
    public HelloWorld() {
    }

    
    @GET
    @Produces("text/html")
    public String getHtml() {
        //TODO return proper representation object
        return "<html><body><h1>Hello nobody!</h1></body></html>";
        //throw new UnsupportedOperationException();
    }
    
    /**
     * Retrieves representation of an instance of HelloWorldResource.HelloWorld
     * @return an instance of java.lang.String
     */
    @Path("/{name}")
    @GET
    @Produces("text/html")
    public String getHtml(@PathParam("name") String name) {
        //TODO return proper representation object
        return "<html><body>name:" + name + "</body></html>";
        //throw new UnsupportedOperationException();
    }
    @Path("/:{name}")
    @GET
    @Produces("application/json")
    public String getJson(@PathParam("name") String name) {
        //TODO return proper representation object
        return "[{name:" + name + "}]";
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of HelloWorld
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }

    
}
