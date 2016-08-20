package resttutorial.database;

import resttutorial.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nitin on 21/8/16.
 */
public class InMemoryMessageDao implements MessageDao{

    private static Map<Long,Message> messages=new HashMap<>();

    @Override
    public List<Message> getMessages() {
        return new ArrayList<>(messages.values());
    }

    @Override
    public Message addMessage(Message message) {
        message.setId(messages.size()+1);
        messages.put(message.getId(),message);
        return message;
    }

    @Override
    public Message updateMessage(Message message) {
        if (message.getId() <= 0) {
            return null;
        } else {
            messages.put(message.getId(), message);
            return message;

        }
    }

    @Override
    public Message delete(long id) {
        return messages.remove(id);
    }

    @Override
    public Message getMessage(long id) {
      return messages.get(id) ;
    }
}
