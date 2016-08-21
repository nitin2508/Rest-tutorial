package resttutorial.service;

import resttutorial.database.InMemoryMessageDao;
import resttutorial.model.Message;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//import static com.sun.org.apache.xml.internal.serializer.utils.Utils.messages;

/**
 * Created by nitin on 20/8/16.
 */
public class MessageService {

    private InMemoryMessageDao messageDao = new InMemoryMessageDao();

    public MessageService(){
        messageDao.updateMessage(new Message( 1,"hello","nitin"));
        messageDao.updateMessage(new Message( 2,"he","nagar"));
    }


    public List<Message> getAllMessage() {
        return messageDao.getMessages();
    }

    public List<Message> getAllMessageForYear(int year) {
        List<Message> messageForYear = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for (Message message : messageDao.getMessages()) {
            cal.setTime(message.getCreated());
            if (cal.get(Calendar.YEAR) == year) {
                messageForYear.add(message);
            }

        }
        return messageForYear;
    }

    public List<Message> getAllMessagesPaginated(int start, int size) {

        List<Message> list = new ArrayList<>(messageDao.getMessages());
        int end = start + size;

        if (end > list.size()) {
            end = list.size();
        }

        return list.subList(start, end);

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
