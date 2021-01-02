package cz.educanet.webik;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("Counter") // <-- localhost:8080/[nazevAppky]/api/Counter
@Produces(MediaType.APPLICATION_JSON) // <--  nastavuji jak chci komunikovat
public class PaymentMethodResource {
    private static int counter = 10;

    @POST
    public Response increment() {
        counter++;
        return Response.ok().build();
    }

    @GET
    public Response getAllPayments() {
        return Response.ok(String.valueOf(counter)).build();
    }

    @DELETE
    public Response decrement() {
        counter--;
        return Response.ok().build();
    }
}
