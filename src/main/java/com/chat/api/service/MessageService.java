package com.chat.api.service;
import java.util.List;
import com.chat.api.model.Message;



public interface MessageService {
List<Message>getAllMessages();

Message saveMessage(String sender,String content);
}
