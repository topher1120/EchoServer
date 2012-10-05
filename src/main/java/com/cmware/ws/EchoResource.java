package com.cmware.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/echo")
public class EchoResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String echo(@QueryParam("value") String value) {
        return value;
    }

}
