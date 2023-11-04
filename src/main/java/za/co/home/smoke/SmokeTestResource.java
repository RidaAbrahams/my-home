package za.co.home.smoke;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/smoke")
public class SmokeTestResource {

    @GET
    public String smokeTest() {
        return "Smoke test works...";
    }
}
