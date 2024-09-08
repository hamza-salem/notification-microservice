package com.digitinary.notification.notification_microservice.services;


import com.digitinary.notification.notification_microservice.entity.Notification;
import com.digitinary.notification.notification_microservice.model.NotificationModel;
import com.digitinary.notification.notification_microservice.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public void save(NotificationModel notificationModel) {
        notificationRepository.save(NotificationModel.getInstance(notificationModel));
    }


    public List<Notification> findAll() {
        return notificationRepository.findAll();
    }
}
