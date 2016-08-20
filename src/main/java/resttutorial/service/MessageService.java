package resttutorial.service;

import resttutorial.database.InMemoryMessageDao;
import resttutorial.model.Message;

import java.util.List;

/**
 * Created by nitin on 20/8/16.
 */
public class MessageService {

    InMemoryMessageDao messageDao = new InMemoryMessageDao();

    public MessageService(){
        messageDao.updateMessage(new Message( 1,"hello","nitin"));
        messageDao.updateMessage(new Message( 2,"he","nagar"));
    }


    public List<Message> getAllMessage() {
        return messageDao.getMessages();
    }

    public Message getMessage(long id) {
        return messageDao.getMessage(id);

    }

    public Message removeMessage(long id){
       return messageDao.delete(id);
    }

    public Message addMessage(Message message){
        return messageDao.addMessage(message);
    }

    public Message updateMessage(Message message){
        return messageDao.updateMessage(message) ;
    }



}
