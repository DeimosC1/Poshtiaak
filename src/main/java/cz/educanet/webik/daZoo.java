package cz.educanet.webik;

import java.util.Scanner;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("Zoo") // <-- localhost:8080/[nazevAppky]/api/Zoo
@Produces(MediaType.APPLICATION_JSON) // <--  nastavuji jak chci komunikovat
public class daZoo {

    private static final ArrayList<String> Animels = new ArrayList<String>();


    @GET
    public Response getAnimol(@QueryParam("getAnimol") int id) {
        if (id <= Animels.size()) {
            if (id == 0) {
                return Response.ok(Animels).build();
            } else {
                return Response.ok(Animels.get(id)).build();
            }
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

    }
    @POST
    public Response spawnAnimal(@QueryParam("newAnimal") String newAnimal) {
        if (newAnimal == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        Animels.add(newAnimal);
        return Response.ok().build();
    }

    @PUT
    public Response putAnimol(@QueryParam("id") String newAnimlo) {
        return Response.ok().build();

    }
    @DELETE
    public Response killAniml(@QueryParam("getAnimal") int id) {
        if (id < 0) {
            return Response.ok(Animels).build();
        }
        Animels.remove(id);
        return Response.ok("kealed " + Animels.get(id)).build();
    }
}

