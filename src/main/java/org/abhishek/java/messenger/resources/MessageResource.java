package org.abhishek.java.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.abhishek.java.messenger.model.Message;
import org.abhishek.java.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	// Filtering by year
	@GET
	public List<Message> getMessages(@QueryParam("year") int year)
	{
	
	if(year > 0){
		return messageService.getAllMessagesForYear(year);
		}
	return messageService.getAllMessages();
//	if(start >= 0 && size >= 0)
//	{
//		return messageService.getAllMessagesPaginated(start, size);
//	}
//	
	}
	
	@POST
	public Message addMessage(Message message){
	return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	    public Message updateMessage(@PathParam("messageId")long Id, Message message){
		message.setId(Id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	
	public void deleteMessage(@PathParam("messageId")long Id){
		
		 messageService.removeMessage(Id);
	}
	
	@GET
	@Path("/{messageId}")
	
	public Message getMessage(@PathParam("messageId")long Id){
	
		return messageService.getMessage(Id);
	}

}
