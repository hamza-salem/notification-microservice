package com.digitinary.notification.notification_microservice.repository;

import com.digitinary.notification.notification_microservice.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
