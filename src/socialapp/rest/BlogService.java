package socialapp.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/blog")
public class BlogService {
	@Path("hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hi";
	}
}
