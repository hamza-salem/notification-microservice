package com.digitinary.notification.notification_microservice.model;

import com.digitinary.notification.notification_microservice.entity.Notification;
import com.digitinary.notification.notification_microservice.enums.NotificationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class NotificationModel {

    private NotificationType notificationType;

    private String title;

    private Long customerId;

    public static Notification getInstance(NotificationModel notificationModel) {
        Notification notification = new Notification();

        notification.setCustomerId(notificationModel.getCustomerId());
        notification.setNotificationType(notificationModel.getNotificationType());

        return notification;
    }
}
