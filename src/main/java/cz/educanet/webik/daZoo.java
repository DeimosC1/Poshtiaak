package cz.educanet.webik;
import java.util.Scanner;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("Zoo") // <-- localhost:8080/[nazevAppky]/api/Zoo
@Produces(MediaType.APPLICATION_JSON) // <--  nastavuji jak chci komunikovat
public class daZoo {
   public String[] animols;



    @GET
    public Response getAllPayments() {
        return Response.ok(String.valueOf(animols)).build();
    }

    @POST
    public Response decrement() {
    Scanner newAnimol = new Scanner(System.in);
    animols = new String[0]; //nedávám

        return Response.ok().build();
    }
}
