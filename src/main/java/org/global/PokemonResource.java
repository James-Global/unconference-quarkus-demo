package org.global;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import io.quarkus.panache.common.Sort;

@Path("/pokemon")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PokemonResource {

    @GET
    public List<Pokemon> getAll() {

        return Pokemon.findAll(Sort.ascending("name")).list();
    }
}
