package resttutorial.resources;

import resttutorial.model.Message;
import resttutorial.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by nitin on 20/8/16.
 */
@Path("messages")
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {
        return messageService.getAllMessage();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message) {
        return messageService.addMessage(message);
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

