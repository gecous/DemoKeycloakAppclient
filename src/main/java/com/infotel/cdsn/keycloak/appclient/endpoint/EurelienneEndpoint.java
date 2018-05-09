package com.infotel.cdsn.keycloak.appclient.endpoint;


import com.infotel.cdsn.keycloak.appclient.item.Eurelienne;
import com.infotel.cdsn.keycloak.appclient.service.EurelienneService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@ApplicationScoped
@Path("/")
public class EurelienneEndpoint {

    @Inject
    private EurelienneService eurelienneService;

    @GET
    @Path("/eureliennes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Eurelienne> getEureliennes() throws IOException {
        return eurelienneService.getEurelienne();
    }
}
