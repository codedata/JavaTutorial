package tw.codedata;
 
import java.util.*;
 
import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;
 
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/hellos")
public class Hellos {
    @POST
    public Viewable add(@FormParam("name") String name) {
        Map model = new HashMap();
        model.put("name", name);               
        return new Viewable("/add", model);
    }
}
