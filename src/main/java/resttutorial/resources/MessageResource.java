package resttutorial.resources;

import resttutorial.model.Message;
import resttutorial.resources.beans.MessageBeanParam;
import resttutorial.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by nitin on 20/8/16.
 */
@Path("/messages")
public class MessageResource {

    private MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages(@BeanParam MessageBeanParam beanParam)

    {
        if (beanParam.getYear() > 0) {
            return messageService.getAllMessageForYear(beanParam.getYear());
        }
        if (beanParam.getStart() >= 0 && beanParam.getSize() >= 0) {
            return messageService.getAllMessagesPaginated(beanParam.getStart(), beanParam.getSize());


        }
        return messageService.getAllMessage();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addMessage(Message message) {
        return Response.status(Response.Status.CREATED)
                .entity(messageService.addMessage(message))
                .header("abc", "efg")
                .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(Message message) {
        return messageService.updateMessage(message);
    }

    @Path("/{messageId}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Message delete(@PathParam("messageId") long id) {
        return messageService.removeMessage(id);
    }


    @Path("/{messageId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Message test(@PathParam("messageId") long id) {
        return messageService.getMessage(id);
    }


//    private Response convertToResponse(List<Message> list){
//        GenericEntity<List<Message>> entity = new GenericEntity<List<Message>>(list) {};
//        return Response.ok(entity).build();
//    }
}

