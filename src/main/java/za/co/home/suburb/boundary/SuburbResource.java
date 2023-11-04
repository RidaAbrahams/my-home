package za.co.home.suburb.boundary;

import za.co.home.suburb.control.SuburbService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Objects;

@Path("/suburb")
public class SuburbResource {
    @Inject
    SuburbService service;

    @POST
    public Response add(SuburbDTO suburbDTO) {
        service.addSuburb(suburbDTO);
        return Response.ok().build();
    }

    @GET
    public String doIt() {
        SuburbDTO suburb = new SuburbDTO("Florida Glen", 1, false, true, 7, "Good suburb");
        service.addSuburb(suburb);
        return "Done";
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") Long id) {
        SuburbDTO result = service.getSuburb(id);
        if (Objects.isNull(result)) {
            return Response.noContent().build();
        } else {
            return Response.ok(result).build();
        }
    }
}
