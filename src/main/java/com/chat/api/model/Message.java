package com.chat.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity //specifies the class is an entity
public class Message {
	
	@Id // makes the id primary key 
	@GeneratedValue(strategy = GenerationType.IDENTITY)// helps auto increment with each insertion
private long id;
private String sender;
private String content;
private LocalDateTime timeStamp;

}
