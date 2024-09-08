package com.digitinary.notification.notification_microservice.entity;


import com.digitinary.notification.notification_microservice.enums.NotificationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    private String title;

    private String body;


    private Long customerId;


    @CreationTimestamp
    private Timestamp createdAt;



}
