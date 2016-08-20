package resttutorial.database;

import resttutorial.model.Message;

import java.util.List;

/**
 * Created by nitin on 21/8/16.
 */
interface MessageDao {

    public List<Message> getMessages();

    public Message addMessage(Message message);

    public Message updateMessage(Message message);

    public Message delete(long id);

    public Message getMessage(long id);
}
