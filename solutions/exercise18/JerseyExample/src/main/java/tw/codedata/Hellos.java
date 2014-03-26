package tw.codedata;
 
import java.util.*;
import javax.ws.rs.*;
 
@Path("/hellos")
public class Hellos {
    private List<String> hellos = Arrays.asList("Hello, World", "Hello, Codedata");
 
    @GET
    public String list() {
        return hellos.toString();
    }   
 
    @GET
    @Path("/{id}")
    public String show(@PathParam("id") int id) {
        return hellos.get(id);
    }

    @GET
    @Path("/add")
    public String addPage() {
        return "AddPage for hellos";
    }


    @POST
    public String add() {
        return "add a hello";
    }
}
