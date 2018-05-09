package com.infotel.cdsn.keycloak.appclient.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infotel.cdsn.keycloak.appclient.item.Eurelienne;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class EurelienneService {

    @Produces
    public List<Eurelienne> getEurelienne() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(getClass().getClassLoader().getResource("eurelienne.json"), ArrayList.class);
    }
}
