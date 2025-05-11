interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}

public class GoodExample {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new EmailNotification(), "Hello, World!");
    }
}