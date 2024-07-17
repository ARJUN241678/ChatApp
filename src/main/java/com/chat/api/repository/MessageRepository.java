package com.chat.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.api.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
