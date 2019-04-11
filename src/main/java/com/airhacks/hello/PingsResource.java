/*
 */
package com.airhacks.hello;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Erik
 */
@Path("hellos")
@Produces(MediaType.APPLICATION_JSON)
public class PingsResource {

    @GET
    @Path("/hello/{echo}")
    public String echo(@PathParam("echo") String param) {
        return param;
    }

    @GET
    @Path("/test")
    public String getTestString() throws NamingException, UnknownHostException {
    	return "Test called at host " + InetAddress.getLocalHost().getHostName() + "and time " + LocalDateTime.now();
    }

}
