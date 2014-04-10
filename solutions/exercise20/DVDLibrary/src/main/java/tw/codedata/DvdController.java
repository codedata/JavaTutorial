package tw.codedata;

import java.util.*;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Context;
 
import org.glassfish.jersey.server.mvc.Viewable;

import javax.servlet.ServletContext;

@Path("/dvds")
public class DvdController {
    @Context ServletContext context;

    public DvdLibraryService getDvdLibraryService() {
        return (DvdLibraryService) context.getAttribute("dvdLibraryService");
    }
    
    @GET
    public Viewable list() {
        Map model = new HashMap();
        model.put("dvds", getDvdLibraryService().allDvds());               
        return new Viewable("/list", model);
    }
    
    @POST
    public Viewable add(
            @FormParam("title") String title, 
            @FormParam("year") Integer year,
            @FormParam("duration") Integer duration,
            @FormParam("director") String director) {

        Dvd dvd = getDvdLibraryService().addDvd(title, year, duration, director);
        System.out.println(dvd.getTitle());
        Map model = new HashMap();
        model.put("dvd", dvd);
        return new Viewable("/success", model);

    }
}
