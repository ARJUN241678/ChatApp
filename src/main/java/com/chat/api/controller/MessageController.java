package com.chat.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.api.model.Message;
import com.chat.api.service.MessageService;
@RestController
@RequestMapping("/messages")
public class MessageController {
	  @Autowired
	    private MessageService messageService;

	    @GetMapping
	    public List<Message> getAllMessages() {
	        return messageService.getAllMessages();
	    }

	    @PostMapping
	    public Message sendMessage(@RequestBody Message message) {
	        return messageService.saveMessage(message.getSender(), message.getContent());
	    }
}
