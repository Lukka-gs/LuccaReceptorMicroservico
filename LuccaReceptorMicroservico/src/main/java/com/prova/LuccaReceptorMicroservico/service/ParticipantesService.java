package com.prova.LuccaReceptorMicroservico.service;

import com.prova.LuccaReceptorMicroservico.entity.ParticipantesEntity;
import com.prova.LuccaReceptorMicroservico.repository.ParticipantesRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantesService {

    @Autowired
    private ParticipantesRepository messageRepository;

    @RabbitListener(queues = "lucca_queue")
    public void receiveMessage(String messageContent) {
    	ParticipantesEntity message = new ParticipantesEntity();
        message.setContent(messageContent);
        messageRepository.save(message);
        System.out.println("Received and saved message: " + messageContent);
    }
}