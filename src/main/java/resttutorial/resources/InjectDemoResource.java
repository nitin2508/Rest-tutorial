package resttutorial.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * Created by nitin on 21/8/16.
 */
@Path("/injectDemo")
public class InjectDemoResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String injectParamUsingAnnotarion(@MatrixParam("param") String matrixParam,
                                             @HeaderParam("authSessionId") String header,
                                             @CookieParam("name") String cookie) {
        return "MatrixParam: " + matrixParam + "HeaderParam: " + header + "Cookie: " + cookie;
    }

    @Path("context")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getParamUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers) {

        String path = uriInfo.getAbsolutePath().toString();
        System.out.println(uriInfo.toString());
        System.out.println(uriInfo.getQueryParameters().toString());
        System.out.println(headers.getCookies());
        return "path: " + path + " Headers: " + headers.getRequestHeaders().toString();

    }
}




