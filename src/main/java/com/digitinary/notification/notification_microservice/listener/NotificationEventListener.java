package com.digitinary.notification.notification_microservice.listener;

import com.digitinary.notification.notification_microservice.config.RabbitMQConfig;
import com.digitinary.notification.notification_microservice.model.NotificationModel;
import com.digitinary.notification.notification_microservice.repository.NotificationRepository;
import com.digitinary.notification.notification_microservice.services.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class NotificationEventListener {

    @Autowired
    private NotificationService notificationService;

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveNotification(NotificationModel notificationModel) {
        log.info("received message {}",notificationModel);
        notificationService.save(notificationModel);
    }
}