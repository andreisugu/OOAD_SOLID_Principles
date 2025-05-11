class NotificationServiceBad {
    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Sending EMAIL: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}


public class BadExample {
    public static void main(String[] args) {
        NotificationServiceBad notificationService = new NotificationServiceBad();
        notificationService.sendNotification("EMAIL", "Hello, World!");
    }
}
